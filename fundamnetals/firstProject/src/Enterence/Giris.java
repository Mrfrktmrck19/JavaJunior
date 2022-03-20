package Enterence;
import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float turkishGrade,mathGrade,physichGrade,musicGrade,arthGrade;
        int numberOfLesson=5;
        System.out.println("Türkçe notunuzu giriniz: ");
        turkishGrade= input.nextFloat();
        System.out.println("Matematik notunuzu giriniz: ");
        mathGrade= input.nextFloat();
        System.out.println("Fizik notunuzu giriniz: ");
        physichGrade= input.nextFloat();
        System.out.println("Müzik notunuzu giriniz: ");
        musicGrade= input.nextFloat();
        System.out.println("Resim notunuzu giriniz: ");
        arthGrade= input.nextFloat();

        System.out.println("Türkçe notunuz: "+ turkishGrade);
        System.out.println("Matematik notunuz: "+ mathGrade);
        System.out.println("Fizik notunuz: "+ physichGrade);
        System.out.println("Müzik notunuz: "+ musicGrade);
        System.out.println("Resim notunuz: "+ arthGrade);

        double result = (turkishGrade+mathGrade+physichGrade+musicGrade+arthGrade)/numberOfLesson;
        System.out.println("GANO: "+result);
        boolean status = result>2?true:false;
        System.out.println("Geçme durumu: "+status);

    }
}

/**
 * @author Ömer Faruk Tomurcuk
 * @since 19.03.2022:
 */
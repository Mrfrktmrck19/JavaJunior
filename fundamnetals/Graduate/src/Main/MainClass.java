package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Scanner input = new Scanner(System.in);
        double math,physic,turkish,chemical,music;
        double average=0;

        System.out.println("Matematik Notunuzu giriniz:");
        math = input.nextDouble();
        if (math>0 && math<101)
            average+=math;

        System.out.println("Fizik Notunuzu giriniz:");
        physic = input.nextDouble();
        if (physic>0 && physic<101)
            average+=physic;

        System.out.println("Türkçe Notunuzu giriniz:");
        turkish = input.nextDouble();
        if (turkish>0 && turkish<101)
            average+=turkish;

        System.out.println("Kimya Notunuzu giriniz:");
        chemical = input.nextDouble();
        if (chemical>0 && chemical<101)
            average+=chemical;

        System.out.println("Müzik Notunuzu giriniz:");
        music = input.nextDouble();
        if (music>0 && music<101)
            average+=music;

        average/=6;
        if(average >=55){
            System.out.println("Sınıfı geçtiniz.");
        }
        else {
            System.out.println("Sınıfı geçemediniz.");
        }
    }
}

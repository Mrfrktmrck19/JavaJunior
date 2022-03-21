import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =0;
        int choice;

        System.out.println("Bir sayı giriniz: ");
        do {
            choice = input.nextInt();
            if(choice%2==0 && choice%4==0) sum+=choice;
        }while (choice%2==0);
        System.out.println("Toplam: "+sum);
    }
}

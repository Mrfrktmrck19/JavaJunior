/**
 * @author: Ömer Faruk Tomurcuk
 * @since: 20.03.2022
 */
package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double x,y,result;

        System.out.println("Yapmak istesiğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        choice = input.nextInt();
        System.out.println("Birinci sayıyı giriniz: ");
        x = input.nextInt();
        y = input.nextInt();
        switch (choice) {
            case 1:
                result = x+y;
                System.out.println("Sonuç: "+result);
                break;
            case  2:
                result = x-y;
                System.out.println("Sonuç: "+result);
                break;
            case 3:
                result = x*y;
                System.out.println("Sonuç: "+result);
                break;
            case 4:
                if(y==0){
                    System.out.println("0'a bölme hatası");
                    break;
                }
                result = x/y;
                System.out.println("Sonuç: "+result);
                break;
            default:
                System.out.println("Tekrar deneyiniz");
                break;
        }
    }
}

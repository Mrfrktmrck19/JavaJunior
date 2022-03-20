/**
 * @author: Ömer Faruk Tomurcuk
 * @title: Uber Price
 * @since 20.03.2022
 */
package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perKiloMeters= 2.2;
        double startFee = 10.0;
        double km,totalFee;  //gidilen yol,toplam ücret

        System.out.println("Gidilen yol giriniz: ");
        km = input.nextDouble();

        totalFee = (km*perKiloMeters)+startFee<20?20:(km*perKiloMeters)+startFee;
        System.out.println("Ücret: "+totalFee);


    }
}

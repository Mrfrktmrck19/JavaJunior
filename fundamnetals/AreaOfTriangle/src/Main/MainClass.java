/**
 * @author: Ömer Faruk Tomurcuk
 * @since: 20.03.2022
 * @title: Area of Triangle
 * @implNote: Calcualte area of triangle.
 */
package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x,y,z;
        double u,area;    //u değeri, üçgenin alanı

        System.out.println("Sırayla üçgenin kenarlarını giriniz: ");
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();

        u = (x+y+z)/2;  //u değerini buluyoruz
        area = Math.sqrt((u)*(u-x)*(u-y)*(u-z));    //üçgenin alanını buluyoruz

        System.out.println("Üçgenin alanı: "+area);





    }
}

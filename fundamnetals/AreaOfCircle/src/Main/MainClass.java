package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,a,area; //yarıçap ve açı ölçüsü ve alan
        double pi = 3.14;

        System.out.println("Yarı çapı giriniz:");
        r = input.nextDouble();
        System.out.println("Daire diliminin açısını giriniz:");
        a = input.nextDouble();

        area = (pi*(r*r)*a)/360;

        System.out.println("Darie diliminin alanı: "+area);
    }
}

package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg,height,bms;   //bms= body mas index

        System.out.println("Boyunuzu metre cinsiden giriniz: ");
        height = input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz: ");
        kg = input.nextDouble();

        bms = kg/(height*height);
        System.out.println("Vücut kitle indexisiniz: "+bms);
    }
}

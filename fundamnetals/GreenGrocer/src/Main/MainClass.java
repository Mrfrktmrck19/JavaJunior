package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pear=2.14;
        double apple=3.67;
        double tomato=1.11;
        double banana=0.95;
        double eggplant=5.0;
        double totatPrice;
        int pearNum,appleNum,tomatoNum,bananaNum,eggplantNum;

        System.out.println("Armut kaç kilo? ");
        pearNum = input.nextInt();
        System.out.println("Elma Kaç Kilo ? ");
        appleNum = input.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        tomatoNum = input.nextInt();
        System.out.println("Muz Kaç Kilo ? ");
        bananaNum = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? ");
        eggplantNum = input.nextInt();

        totatPrice = (pear*pearNum)+(apple*appleNum)+(tomato*tomatoNum)+(banana*bananaNum)+(eggplant*eggplantNum);
        System.out.println("Toplam fiyat: "+totatPrice);
    }
}

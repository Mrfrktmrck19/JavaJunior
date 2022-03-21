package MAin;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int limit = input.nextInt();
        int counter=0;
        int sum=0;
        while (counter<=limit){
            if(counter%3==0 && counter%4==0) sum+=counter;
            counter++;
        }
        System.out.println("Toplam: "+sum);
    }
}

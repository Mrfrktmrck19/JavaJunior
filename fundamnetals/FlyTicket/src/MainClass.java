import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age,choice,km;
        double price;
        System.out.println("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.println("Yolculuk tipi:\n1.Tek Yön\n2.Çift Yön ");
        choice = input.nextInt();
        System.out.println("Gidilecek mesafe");
        km = input.nextInt();

        input.close();

        price = km*0.1;
        if(age<12)
            price -= price*0.5;
        else if(12<=age && age<24)
            price-= price*0.1;
        else if(65<age)
            price -= price*0.2;

        if(choice==2)
        {
            price -=price*0.2;
            price*=2;
        }





        System.out.println("Toplam Tutar: "+price);
    }
}

package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName="mrfrktmrck";
        String password="123456789";
        input.close();

        System.out.println("Kullanıcı adı: ");
        userName = input.nextLine();
        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("mrfrktmrck") && password.equals("123456789")){
            System.out.println("Giriş yaptınız");
        }
        else{
            System.out.println("Bilgileriniz yanlış. Şifrenizi sıfırlamak ister misiniz?\n1.Evet\n2.Hayır");
            Scanner inp = new Scanner(System.in);
            int choice = inp.nextInt();
            if(choice == 1){
                System.out.println("Lütfen yeni şifrenizi giriniz:");
                String newPsw = inp.nextLine();
                if(newPsw.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    password= newPsw;
                    System.out.println("Atama işleminiz tamamlandı.");
                }
            }
            else if(choice==2){
                System.out.println("Giriş işlemi sonlandırıldı.");
            }
            else{
                System.out.println("Yanlış tuşlama yaptınız.");
            }

        }
    }
}

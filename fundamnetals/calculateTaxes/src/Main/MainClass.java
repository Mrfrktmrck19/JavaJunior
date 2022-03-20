/**
 * @author: Ömer Faruk Tomurcuk
 * @since 20.03.2022
 * @title: Calculate Taxes
 */

package Main;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        double taxesProductPrice,taxFreeProductPrice,taxAmount;
        Scanner input = new Scanner(System.in);

        System.out.println("Lüften ürünün KDV'li tutarını giriniz: ");
        taxesProductPrice = input.nextDouble();

        taxAmount = taxesProductPrice>1000?0.18:0.8;    //KDV oranını hesaplayacak
        taxFreeProductPrice = taxesProductPrice/(1.0+taxAmount);    //vergisiz ürün fiyatı bulunuyor.

        System.out.println("Ürünün KDV'li tutarı: "+taxesProductPrice);
        System.out.println("Ürünün KDV'siz tutarı: "+taxFreeProductPrice);
        System.out.println("KDV oranı: "+taxAmount);
        System.out.println("KDV tutarı: "+(taxAmount*taxFreeProductPrice));

    }
}

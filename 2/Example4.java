/*Adım1:Başla
*Adım2:üçgenin kenar uzunluğunu giriniz;a
*Adım3:bu kenara ait yüksekliği giriniz;b
*Adım4:üçgenin alanını hesapla;a*b/2
*Adım5:dur
*/

import java.util.Scanner;
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen üçgenin bir kenar uzunluğunu giriniz:");
        int a = input.nextInt();
        System.out.println("Lütfen girdiğiniz kenara ait yüksekliği giriniz");
        int b = input.nextInt();
        int alan = a*b/2;
        System.out.println("alan: " +alan );
        
        
        
    }

}

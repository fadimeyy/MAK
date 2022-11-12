/*Adım1:Başla
 *Adım2:kullanıcadan ilk terimi iste;a
 *Adım3:kullanıcadan son terim sayısını iste;b
 *Adım4: kullanıcadan artış miktarını iste;c
 *Adım5:terim sayısını hesapla ; ((b-a)/c)+1=n
 *Adım6:terim toplamını hesapla ;(a+b)/2*n
 *Adım7:dur
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ilk terimi girin:");
        double a = input.nextDouble();
        System.out.println("lütfen son terimi giriniz:");
        double b = input.nextDouble();
        System.out.println("lütfen ortak artış miktarını giriniz:");
        double c = input.nextDouble();
        double n = ((b-a)/c)+1;
        System.out.println("terim sayısı:" +n);
        double toplam = (a+b)/2*c;
        System.out.println("terim toplamı:" +toplam);
       
        
        
        
        
    }

    
}

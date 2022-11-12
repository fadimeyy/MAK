/*Adım1:Başla
 *Adım2:kullanıcan yarıcapı iste ;r
 *Adım3:kullanıcan periyot yani bir tam turu tamamladığı saniye;T
 *Adım4:kullanıcan pi sayısını iste; pi
 *Adım5:çizgisel hızı hesapla;2*pi*r/T
 *Adım6:dur
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen yarıçapı giriniz:");
        double r = input.nextDouble();
        System.out.println("lütfen periyotu yani bir tam turu tamamladığı saniyeyi giriniz:");
        double T = input.nextDouble();
        System.out.println("lütfen pi sayısını giriniz:");
        double pi =input.nextDouble();
        double çizgiselhız = 2*r*pi/T;
        System.out.println("cizgisel hız:" +çizgiselhız);
       
    }
      
    
}

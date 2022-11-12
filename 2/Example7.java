7*Adım1:Başla
 *Adım2:kulanıcadan bir iletkenin direncini iste; R
 *Adım3:kullanıcadan akım iste; I 
 *Adım4: gerilimi hesapla; I*R
 *Adım5: dur;
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen iletkenin direncini giriniz:");
        int R = input.nextInt();
        System.out.println("lütfen akımı giriniz :");
        int I = input.nextInt();
        int gerilim = R*I ;
        System.out.println("gerilim:" +gerilim);
        
    }
    
}

/*Adım1:Başla
 *Adım2:kullanıcıdan maddenin kütlesini iste;m
 *Adım3:maddenin yerden yükseliğini iste;h
 *Adım4:maddenin hızını iste,v
 *Adım5:kullanıcıdan yer çekimini iste ; g
 *Adım6:dur
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen maddenin kütlesinni giriniz :");
        int m = input.nextInt();
        System.out.println("lütfen maddenin yerden yüksekliğini giriniz:");
        int h = input.nextInt();
        System.out.println("lütfen maddenin hızını giriniz:");
        int v = input.nextInt();
        System.out.println("yer çekimini giriniz:");
        int g = input.nextInt();
        int potansiyelenerji = m*h*g;
        int kinetikenerji =(m*v*v)*1/2;
        System.out.println("hesaplanan potansiyel enerji:" + potansiyelenerji);
        System.out.println("hesaplanan kinetik enerji: " + kinetikenerji);
        
        
       
    }
    
}

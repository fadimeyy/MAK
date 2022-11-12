/*Adım1:Başla
 *Adım2:kürenin yarıçapını giriniz;r
 *Adım3:pi ye değer verin;pi
 *Adım4:kürenin hacmini hesapla;4/3*pi*r^2
 *Adım5:kürenin alanını hesapla; 4*pi*r^2
 *Adım6:dur;
 */

import java.util.Scanner;
public class Example5 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen kürenin yarıçapını giriniz :");
        int r = input.nextInt();
        System.out.println("pi geğerini giriniz:");
        double pi = input.nextDouble();
        double hacim= (pi*r*r*r)*4/3;
        double alan = 4*pi*r*r;
        System.out.println("hacim:" + hacim + " ve alan:" + alan);
        
        
        
       
        
        
       
    }

}

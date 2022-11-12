/*Adım1:Başla
 *Adım2:kullanıcıdan bir sayı iste;a
 *Adım3:eğer sayı 1 ise pazartesi yazdır
 *Adım4:eğer sayı 2 ise salı yazdır 
 *Adım5: eğer sayı 3 ise çarşamba yazdır;
 *Adım6: eğer sayı 4 ise perşembe yazdır
 *Adım7:eğer sayı 5 ise cuma yazdır;
 *Adım8:eğer sayı 6 ise cumartesi yazdıt;
 *Adım9:eğer sayı 7 ise pazar yazdır;
 *Adım10:eğer sayı>7 ise yoktur yazdır
 *Adım11:bitir
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen bir sayı giriniz:");
        int a= input.nextInt();
        if (a<=0){
            System.out.println("Bu sayıda gün yoktur.");
        }
        if (a==1){
            System.out.println("pazartesi");
        }
        else if (a==2){
            System.out.println("salı");
        }
        else if (a==3){
            System.out.println("çarsamba");
            
        }
        else if (a==4){
            System.out.println("perşembe");
        }
        else if (a==5){
            System.out.println("cuma");
        }
        else if(a==6){
            System.out.println("cumartesi");
        }
        else if (a==7){
            System.out.println("pazar");
        }
        else{
            System.out.println("Bu sayıda gün yoktur.");
        }
        
    }
    
}

/*Adım1: Başla
 *Adım2:kullanıcıdan sayı1 sayı2 sayı3 al
 *Adım3:eğer sayi>sayi2 ve sayi1>sayi3 ise sayi1 yazdır
 *Adım4:eğer sayi2>sayi1 ve sayi2>sayi3 ıse sayi2 yazdır
 *Adım5:eğer sayi3>sayi1 ve sayi3>sayi3 ise sayi3 yazdır
 *Adım6:aksi takdirde "buyukluk yok" yazdır
 *Adım7:bitir
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("1. sayıyı giriniz:");
        int sayi1= input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int sayi2= input.nextInt();
        System.out.println("3. sayıyı giriniz:");
        int sayi3= input.nextInt();
        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println(sayi1+ " en büyüktür");
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println(sayi2+ " en büyüktür");
        }
        else if (sayi3>sayi1 && sayi3>sayi2){
            System.out.println(sayi3+ " en büyüktür");
        }
        else{
            System.out.println("Büyüklük yoktur");
        }
            
        
        
    }
    
}

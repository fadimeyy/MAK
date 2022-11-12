/*Adım1:Başla
 *Adım2: kulllanıcıdan bir sayı iste; x
 *Adım3:eğer x>0 ise pozitif yazdır ;
 *Adım4: değilse negatif yazdır bitir;
 *Adım5:eğer ikisi dedeğilse 0 yazdır;
 *Adım6:bitir
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
        Scanner input= new Scanner (System.in);
        System.out.println("lütfen bir sayı girinbiz:");
        int x = input.nextInt();
        if (x>0){
            System.out.println(x+" pozitiftir");
        }
        else if(x<0){
            System.out.println(x+" negatiftir");
        }
        else{
            System.out.println(x+" sıfırdır");
                    
        }
        
    }
    
}

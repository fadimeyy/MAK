/*Adım1: Başla
 *Adım2:Toplam=0
 *Adım3:s=1
 *Adım4:Eğer S>5 ise git adım8
 *Adım5: toplam=toplam + S
 *Adım6:S=S+1
 *Adım7: git adım4
 *Adım8:toplam yazdır
 *Adım9: bitir
 */

/**
 *
 * @author Fadime ERBAY
 */

 public class Example4{

    /**
     * @param args the command line arguments
     */
   public static void main(String [] args){
        int toplam = 0;
        int S=1;
        while(S<=5){
                toplam=toplam+S;
                S=S+1;
                
               
        }
        System.out.println(toplam);
        
    }
    
}

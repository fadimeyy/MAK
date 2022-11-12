/*Adım1:Başla
 *Adım2:kullanıcıdan a b c sayılarını isteyin;
 *Adım3:eğer a=b veya b=c veya c=b veya c=a eşit ise ikizkenar üçgen yazdır;
 *Adım4:eğer a=b=c ise eşitkenar üçgen yazdır;
 *Adım5:değilse çeşitkenar üçgen yazdır;
 *Adım6:bitir
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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.println("üçgenin birinci kenarının uzunluğunu giriniz:");
        int a= input.nextInt();
        System.out.println("üçgenin ikinci kenarının uzunluğunu giriniz:");
        int b= input.nextInt();
        System.out.println("üçgenin üçüncü kenarının uzunluğunu giriniz:");
        int c= input.nextInt();
        
        if ( a==b && b==c) {
            System.out.println("Üçgen eşkenar üçgendir.");
        }
    
        else if(a==b || b==c || c==b){
            System.out.println("Üçgen ikizkenar üçgendir.");
        }
        else{
            System.out.println("Üçgen çesitkenar üçgendir.");
        }
    }
    
}

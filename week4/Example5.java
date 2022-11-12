/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fadime ERBAY
 */
import java.util.Scanner;
public class Example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("bir n sayısı giriniz:");
        int n = input.nextInt();
        int toplam=0;
        int kalan= n%10;
        while(n>0){
            kalan=n%10;
            toplam= toplam + kalan;
                    n=n/10;
                    
         
            
        }
           System.out.println("Basamaklar toplamı:" +toplam);
        
                
        
        
        
                
    }
    
   
}


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
public class Ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
           Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        System.out.println("Lütfen bir r sayısı giriniz:");
        int r =input.nextInt();
        int f1=1;
        int f2=1;
        int f3=1;
        int k=1;
  
        
            for (int i = 1; i <= n;i++) {
                f1=f1*i;
            
                if (i<=r){
                    f2=f2*i;
                }
                if (i<=n-r){
                    f3=f3*i;
                }
            }
   
              k = f1/(f2*f3) ; 
                
       

            System.out.println("kombinasyon:"  +k );
       
           
        
                
        
    }
    
    
}
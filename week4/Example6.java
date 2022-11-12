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
public class Example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        boolean asalmı=true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                asalmı=false;
                
            }
            
            
        }
        if (asalmı==true && n!=1){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }
        
        

                 
    }
    
}

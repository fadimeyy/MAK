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
public class Ödev6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n sayı giriniz:");
        int n=input.nextInt();
        System.out.println("lütfen bir a sayı giriniz:");
        int a=input.nextInt();
        int b=0;
        for (int i = 0; i < a; i++) {
           b=b+n;
            
        }
        System.out.println(a+" x "+b+" = "+b);
 
                
        
    }
    
}

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
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir a sayısı giriniz:");
        int a= input.nextInt();
        
        while(0<a){
            System.out.println(a%10);
            a=a/10;
          
        }
         
       
    }
    
}

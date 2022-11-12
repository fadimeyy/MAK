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
public class Ödev8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("lütfen bir a sayısı giriniz ");
        int a=input.nextInt();
        System.out.println("lütfen bir b sayısı giriniz ");
        int b=input.nextInt();
        System.out.println("lütfen bir n sayısı giriniz ");
        int n=input.nextInt();
        int c= 1;
        for (int i = 1; i < n; i++) {
            a=10*a;
            c=a/b;
            a=a%b;
            
            
        }
        System.out.println(c);
    }
    
}

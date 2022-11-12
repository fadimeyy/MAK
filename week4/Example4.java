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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n bitiş sayı giriniz:");
        int n = input.nextInt();
        System.out.println("lütfen bir a başlangıç sayısı giriniz;");
        int a= input.nextInt();
        for (int i = a; i < n; i++) {
            if (i%3==0 || i%4==0){
                System.out.println(+i);
            }
           
            
        }
    }
    
}

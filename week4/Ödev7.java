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
public class Ödev7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir a sayısı giriniz");
        int a= input.nextInt();
        int b = 0;
        int k=1;
        while (a>0){
            k=a%10;
            b=b*10+k;
            a=a/10;
            
        }
        System.out.println(b);
    }
    
}

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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        int sayi;
        do{
            System.out.println("lütfen 0 ile 100 arasında bir tam sayı giriniz");
            sayi = input.nextInt();
        }
        while(0>sayi || sayi>100);
        System.out.println("girdiğiniz sayı: "  +sayi);
    }
    
}

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
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        int sayi;
        do{
            System.out.println("lütfen pozitif bir tam sayı giriniz");
            sayi = input.nextInt();
        }
        while(sayi<=0);
        System.out.println("girilen sayı " +sayi);
    }
    
}

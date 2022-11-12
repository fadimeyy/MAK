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
public class Ödev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir a sayısı giriniz:");
       double a= input.nextDouble();
        System.out.println("Dönüştürme seçenekleri 1=mm 2=cm 3=dm 4=km");
        System.out.println("Lütfen bir seçenek giriniz:");
        double secenek =input.nextDouble();
        double b=0;
        if (secenek==1){
            b=1000*a;
        }
        else if(secenek==2){
            b=100*a;
        }
        else if(secenek==3){
            b=10*a;
        }
        else{
           b=a/1000; 
        }
        System.out.println(b);
    }
    
}

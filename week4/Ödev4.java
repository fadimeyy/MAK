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
public class Ödev4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("bir x sayısı giriniz:");
        int x= input.nextInt();
        int fx=x*x-5*x+5;
        if(fx<0){
            System.out.println("Negatiftir. ");
        }
        else if(fx==0){
            System.out.println("Sıfırdır.");
        }
        else {
            System.out.println("Pozitiftir.");
        }      
    }
}

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
public class Ödev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz:");
        int n=input.nextInt();
        int S=0;
        int çift_toplam=0;
        int tek_toplam=0;
        int toplam=0;
        while (S<=n ){
            if(S%2==0){
                çift_toplam=çift_toplam+S;
                
            }
            else{
                tek_toplam=tek_toplam+S;
            }
           toplam=toplam+S;
            S=S+1;
            
        }
       System.out.println("Tek sayıların toplamı:" +tek_toplam);
           System.out.println("Çift sayıların toplamı:" +çift_toplam);
              System.out.println("Toplam:" +toplam);
                
    }
    
}

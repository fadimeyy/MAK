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
                Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n sayı giriniz:");
        int n = input.nextInt();
      
        int S = 1;
        int çift=0;
        int tek=0;
        while (S <=n) {
            if(S%2==0){
                çift=çift+S;
                
        }
            else{
                tek=tek+S;
            }
     
          
            S = S + 1;
           
            

        }
        System.out.println("çift toplam:" +çift);
        System.out.println("tek toplam:" +tek);
        

        }



    }
    



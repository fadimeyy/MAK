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
public class Ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
        System.out.println("lütfen s sayısı giriniz:");
       double S=input.nextDouble();
       
        for (int i = 0; i <= S; i++) {
            for (int j = 0; j <=S; j++) {
                          if(S==5*i+3*j){
                          System.out.println(i);
                          System.out.println(j);
                              
                          }
            }
  
                
            
            
        }
    }
    
}                                                                  
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
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input =new Scanner(System.in);
        double vize;
        double fnl;
        double ort;
        do{
            System.out.println("vize notlarını giriniz");
            vize= input.nextDouble();
            
            
        }
        while (0>vize || vize>100);
        
        do{
            System.out.println("final notlarını giriniz");
            fnl= input.nextDouble();
          }
            
        while (fnl<0 || fnl>100);
        
        ort=(fnl*0.6+vize*0.4);
       
        if(80<=ort ||ort<=100){
            System.out.println("A " +ort);
        }
        else if(60<=ort || ort<=79){
            System.out.println("B " +ort);
            
        }
          else if(50<=ort || ort<=59){
            System.out.println("C " +ort);
          }
          else {
            System.out.println("D " +ort);
          }
        
        
        
        
        
    }
    
}

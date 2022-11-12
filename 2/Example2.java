/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;
public class Example2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit derecesi giriniz :");
        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit -32) / 1.8;
        System.out.println("Celcius derecesi: " + celcius);
        
        
    
        
     
    }
}

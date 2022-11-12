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
        Scanner input = new Scanner(System.in);
        System.out.println("bir n sayısı iste");
        int n = input.nextInt();
        int S=1;
        int faktoriyel=1;
        while(S<=n){
        faktoriyel=faktoriyel*S;
        S=S+1;  
        }
                System.out.println("n faktoriyel:" +faktoriyel);
    }   
}
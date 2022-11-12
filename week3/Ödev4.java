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
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir n sayı giriniz:");
        int n = input.nextInt();
        int TOPLAM = 0;
        int S = 1;
        while (S <=n) {
             TOPLAM = TOPLAM + S;
            S = S + 2;
           


        }
                System.out.println("Toplam:" + TOPLAM);


    }

}

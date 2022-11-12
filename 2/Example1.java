

import java.util.Scanner; //jav'nın util kütüphanesine ait Scanner class'ı import edildi
public class Example1  {

    public static void main (String[] args) {
        //TODO code application logic here
        Scanner input = new Scanner (System.in);// konsoldan dğer almak için tanımladık
        System .out .println ("LÜTFEN KM CİNSİNDEN DEĞER GİRİNİZ:");
        int km = input.nextInt();
        int metre = km*1000;
        System.out.println("hesaplanan metre:" +metre);
        

}}

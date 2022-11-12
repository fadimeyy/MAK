import java.util.Scanner;
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen birinci sayıyı giriniz :");
        int a= input.nextInt ();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int b = input.nextInt();
        System.out.println("lütfen üçüncü sayıyı giriniz");
        int c= input.nextInt();
        int toplam = a + b + c;
        int çarpım = a*b*c;
        double ort = (double) toplam / 3;
        System.out.println(" ortalama: " + toplam +" Ve çarpım: " +çarpım);
    
    }
    
}

/*Adım1:Başla
 *Adım2:kullanıcıdan molü iste ;m
 *Adım3:kullanıdan çözeltinin litresini iste;L,
 *adım4:kullanıcadan çözücünün kilgramını isteyin;kg
 *Adım5:molarite hesapla; m/L
 *Adım6:molalite hesapla;m/kg
 *Adım7:dur
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
        Scanner input = new Scanner (System.in);
        System.out.println("lütfen mol sayısını giriniz:");
        double m = input.nextDouble();
        System.out.println("lütfen çözeltinin litresini giriniz: ");
        double L = input.nextDouble();
        System.out.println("lütfen çözücünün kilogramını giriniz:");
        double kg = input.nextDouble();
        double molarite = m/L;
        double molalite =m/kg;
        System.out.println("Çözeltinin molaritesi:" +molarite);
        System.out.println("cözeltinin molalitesi:" +molalite);
    }
    
}

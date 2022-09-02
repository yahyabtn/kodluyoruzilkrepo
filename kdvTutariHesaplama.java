import java.util.Scanner;
public class kdvTutariHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, kdvliFiyat, netKdv, kdvSecimi;
        System.out.print("URUN TUTARI =  ");
        tutar = input.nextDouble();

        boolean kosul1 = tutar >= 1000;
        kdvSecimi = kosul1 ? 8 : 18;

        netKdv = (tutar * kdvSecimi) / 100;
        kdvliFiyat = tutar + netKdv;
        kdvOrani = kdvSecimi;

        System.out.println("kdvsiz fiyat= " + tutar);
        System.out.println("kdvli fiyat= " + kdvliFiyat);
        System.out.println("kdv= " + netKdv);
        System.out.println("kdv orani= " + kdvOrani);
    }
}
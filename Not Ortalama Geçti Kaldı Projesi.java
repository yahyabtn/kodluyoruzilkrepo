import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Değişkenleri oluştur
        int matematik,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullancıdan değerleri al
        System.out.print("Matematik Notumuz");
        matematik = inp.nextInt();

        System.out.print("fizik Notumuz");
        fizik = inp.nextInt();

        System.out.print("Kimya Notumuz");
        kimya = inp.nextInt();

        System.out.print("Turkce Notumuz");
        turkce = inp.nextInt();

        System.out.print("Tarih Notumuz");
        tarih = inp.nextInt();

        System.out.print("Muzik Notumuz");
        muzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız : " + sonuc);

        boolean kosul = sonuc >= 60.0;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);

    }
}
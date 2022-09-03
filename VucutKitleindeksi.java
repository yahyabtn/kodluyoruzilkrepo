import java.util.Scanner;

public class VucutKitleindeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;

        Scanner inp = new Scanner(System.in);

        System.out.println("Vücut boyunuzu giriniz =");
        boy = inp.nextInt();

        System.out.println("Vücut kilosunu giriniz =");
        kilo = inp.nextInt();


        indeks = (kilo/(boy*boy));

        System.out.println("Kilonuz:" + kilo);
        System.out.println("Boyunuz:" + boy);
        System.out.println("Vücut indeksi :" + indeks);


    }
}

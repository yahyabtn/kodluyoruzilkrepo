import java.util.Scanner;
public class Dersgecme50 {
    public static void main(String[] args) {
        //değişken tanımla
        int mat, turk, fzk, kimy, mzk;

        //veri gir
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = inp.nextInt();
        System.out.print("Türkçe notunu giriniz : ");
        turk = inp.nextInt();
        System.out.print("Fizik notunu giriniz : ");
        fzk = inp.nextInt();
        System.out.print("Kimya notunu giriniz : ");
        kimy = inp.nextInt();
        System.out.print("Müzik notunu giriniz : ");
        mzk = inp.nextInt();

        //Girilen notlar 0-100 aralığında mı?
        int i = 0, top = 0;
        if (mat<=100 && mat>=0) {
            i++;
            top = top + mat;
        }

        if (turk<=100 && turk>=0) {
            i = i + 1;
            top = top + turk;
        }

        if (fzk<=100 && fzk>=0) {
            i = i +1;
            top = top + fzk;
        }

        if (kimy<=100 && kimy>=0) {
            i = i + 1;
            top = top + kimy;
        }

        if (mzk<=100 && mzk>=0) {
            i = i + 1;
            top = top + mzk;
        }

        //ortalama hesapla
        double ort;
        ort = (top/i);

        System.out.println("Not Ortalaması : " + ort);

        // 55 puan üzerinden Geçti - Kaldı durumunu göster

        if (ort<55) System.out.println("Kaldiniz... :(");
        else System.out.println("Geçtiniz... :)");

    }
}


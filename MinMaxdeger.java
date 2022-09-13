import java.util.Scanner;

public class MinMaxdeger {
    public static void main(String[] args) {
        int sayi, sayiGir, min = 1, max = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz :");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayiGir = input.nextInt();

            if (i == 1) {
                min = sayiGir;
                max = sayiGir;
            }

            if (sayiGir > max) {
                max = sayiGir;
            } else if (sayiGir < min) {
                min = sayiGir;
            }
        }

        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);

    }
}

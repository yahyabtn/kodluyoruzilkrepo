import java.util.Scanner;

public class HesapmakinesiSwitch {
    public static void main(String[] args) {
        double n1,n2;
        int select;

        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        n1 = inp.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        n2 = inp.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz");

        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama :" + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarma " + (n1*n2));
                break;
            case 4:
                if(n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez.");
                } else {
                    System.out.println("Bölme " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Lütfen bir sayı giriniz.");

            }
        }
    }


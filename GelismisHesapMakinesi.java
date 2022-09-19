import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan =new Scanner(System.in);
        int a,b,result;

        while (true){
            result=0;
            System.out.println("Please Enter the first number :");
            a=scan.nextInt();
            if (a==0){
                break;
            }
            System.out.println("Please Enter the second number :");
            b =scan.nextInt();
            result=a%b;
            System.out.println("Sonuç :" +result);
            System.out.println();
        }
    }

    static void alançevre(){
        Scanner scan =new Scanner(System.in);
        int a,b,result1,result2;
        while (true){
            System.out.println("Uzun Kenarı Giriniz :");
            a=scan.nextInt();
            if (a==0){
                System.out.println("Kenar uzunluğu 0 olamaz!");
                break;
            }
            System.out.println("Kısa Kenarı Giriniz :");
            b=scan.nextInt();
            if (b==0){
                System.out.println("Kenar Uzunluğu 0 olamaz!");
                break;
            }
            result1= 2*(a+b);
            result2 =a*b;
            System.out.println("Dikdörtgen Çevresi : " +result1);
            System.out.println("Dikdörtgen Alanı : " +result2 );
            System.out.println();
        }
    }

    static void yüzde(){
        Scanner scan =new Scanner(System.in);
        int a,b,result;
        while (true){
            System.out.println("Yüzdesi Alınacak Sayıyı Giriniz :");
            a=scan.nextInt();
            System.out.println("Yüzde kaç alınsın :");
            b=scan.nextInt();

            result=a*b/100;
            System.out.println("Sonuç :" + result);
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "9- Yüzde Alma\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alançevre();
                    break;
                case 9:
                    yüzde();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
import java.util.Scanner;

public class ArtikyilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz.");
        int year = scanner.nextInt();
        scanner.close();
        if(year%100==0){
            if(year%400==0){
                System.out.println(year +" Artık yıldır.");
            }
            else{
                System.out.println(year +" Artık yıl değildir.");
            }
        }else if(year %4 ==0){
            System.out.println(year +" Artık yıldır.");
        }else{
            System.out.println(year + " Artık yıl değildir.");
        }
    }
}
import java.util.Scanner;

public class Mukemmelsayilar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sayi, sonuc=0;
        System.out.print("Sayı Giriniz : ");
        sayi = scanner.nextInt();


        for(int i =1; i<sayi; i++){

            if(sayi %i==0){
                sonuc += i;
            }

        }

        if(sayi == sonuc){
            System.out.println("Girilen sayı : " + sayi + " Mükemmel sayidir...");
        }else{
            System.out.println("Girilen sayı : " + sayi + " Mükemmel sayi değil...");
        }
    }
}
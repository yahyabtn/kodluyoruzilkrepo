import java.util.Scanner;

public class Bolunensayilar {
    public static void main(String[] args) {
        int k, c = 0, i = 0, sum = 0;

      try  (Scanner inp = new Scanner(System.in)) {
        System.out.println("Sayı giriniz : ");
        k = inp.nextInt();
    }

        for ( i = 0; i <= k ; i++) {
           if (i %3 ==0 || i %4 ==0) {
               System.out.println(i);
               sum +=i;
               c ++;
           }
        }System.out.print("Değerlerin ortalama : " + sum / c);
    }
}

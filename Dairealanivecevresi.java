import java.util.Scanner;


public class Dairealanivecevresi {
    public static void main(String[] args) {
        int a , r;
        double pi = 3.14 , alan;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        System.out.println("Merkez acisinin olcusunu giriniz = ");
        a = inp.nextInt();
        alan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı : " + alan);


    }
}

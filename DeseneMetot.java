import java.util.Scanner;

public class DeseneMetot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        decreaseIncreaseBy5(sayi);
    }

    private static void decreaseIncreaseBy5(int number) {
        System.out.print(number + " ");
        if (number <= 0) return;
        decreaseIncreaseBy5(number - 5);
        System.out.print(number + " ");
    }
}
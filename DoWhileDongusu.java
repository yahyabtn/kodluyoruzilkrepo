import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.println("Şifre Giriniz :");
            pass = input.nextInt();
            if (pass==123) {
                System.out.println("Doğur");
                askPassword = false;
            }else {
                System.out.println("Yanlış");
            }
        }while (askPassword);
    }
}

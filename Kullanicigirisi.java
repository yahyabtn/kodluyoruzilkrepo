import java.util.Scanner;
import java.lang.String;
import java.net.SocketTimeoutException;

public class Kullanicigirisi {
    public static void main(String[] args) {
        String userName, newPassword, answer, password;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz.");
        userName = inp.nextLine();

        System.out.println("Şifrenizi giriniz.");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Yaptınız");
        } else if (!userName.equals("patika") || password.equals("java101")) {
            System.out.println("Kulanıcı adınız geçerli değil.Lütfen geçerli kullanıcı adını giriniz. !");
        } else if (userName.equals("patika") || !password.equals("java101")) {
            System.out.println("Şifreniz geçerli değil!!");
            System.out.println("Yeni şifre oluşturmak istermisiniz --> 'y/n': ");
            Scanner scan = new Scanner(System.in);
            answer = inp.nextLine();
            if (answer.equals("n") || answer.equals("N")) {
                System.out.println("Sistem Kapanıyor\n.................");
            } else if (answer.equals("y") || answer.equals("Y")) {
                System.out.println("Yeni şifrenizi yazın:");
                newPassword = inp.nextLine();

                if (newPassword.equals("java101")) {
                    System.out.println("Yeni şifreniz bir önceki şifreyle aynı olmaz.");
                } else {
                    password = newPassword;
                    System.out.println("Başarolı, şifrenizi değiştirdiniz.");
                }
            }
        }
    }
}
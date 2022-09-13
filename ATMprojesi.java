import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while (right>0) {
            System.out.println("Kuallanıcı adınız :");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz :");
            password = input.nextLine();

            if(userName.equals("yahya") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz :");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye. Bakiyeniz : " + balance);
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler...");
                            break;
                        default:
                            System.out.println("hatalı tuşlama yaptınız.");
                    }
                } while (select != 4);
            } else{
                    right--;
                    System.out.println("Hatalı kullanıcı adı ya da şifre. Lütfen tekrar deneyiniz. ");
                    if(right == 0) {
                        System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz.");
                    }else{
                        System.out.println("Klana Hakkınız : " + right);


                            }

                    }
                }
            }
        }


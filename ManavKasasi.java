import java.util.Scanner;

public class ManavKasasi {
    public static void main(String[] args) {

       double ArmutKilosu = 2.14,
               elmaKilosu = 3.67,
              domatesKilosu = 1.11,
               muzKilosu = 0.95,
               patlicanKilosu = 5.00,
               armutMiktari,elmaMiktari,domatesMiktari,muzMiktari,patlicanMiktari;

       Scanner input = new Scanner(System.in);
       System.out.println("Armut kaç kilo ?");
       armutMiktari =input.nextDouble();

        Scanner inputt = new Scanner(System.in);
        System.out.println("Elma kaç kilo ?");
        elmaMiktari =input.nextDouble();

        Scanner inputtt = new Scanner(System.in);
        System.out.println("Domates kaç kilo ?");
        domatesMiktari =input.nextDouble();

        Scanner inputttt = new Scanner(System.in);
        System.out.println("Muz kaç kilo ?");
        muzMiktari =input.nextDouble();

        Scanner inputtttt = new Scanner(System.in);
        System.out.println("Patlıcan kaç kilo ?");
        patlicanMiktari =input.nextDouble();

        double toplamTutar;
        toplamTutar = (armutMiktari*ArmutKilosu)+(elmaMiktari*elmaKilosu)+(domatesMiktari*domatesKilosu)+(muzMiktari*muzKilosu)+(patlicanKilosu*patlicanMiktari);

        System.out.println("Toplam Tutar "+ toplamTutar );





    }
}

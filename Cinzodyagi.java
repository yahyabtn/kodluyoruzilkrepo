import java.util.Scanner;

public class Cinzodyagi {
    public static void main(String[] args) {

        int num, birthDay, realDivide = 12;


        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Lütfen doğum tarihinizi bu şekilde giriniz (1996): ");
            birthDay = inp.nextInt();
        }

        num = (birthDay % realDivide);

        switch (num) {
            case 0:
                System.out.print("Çin burcunuz doğum gününüz: Maymun");
                break;

            case 1:
                System.out.print( "Çin burcunuz doğum gününüz: Horoz" );
                break;

            case 2:
                System.out.print ( "Çin burcunuz doğum gününüz: Köpek" );
                break;

            case 3:
                System.out.print ( "Çin burcunuz doğum gününüz: Domuz" );
                break;

            case 4:
                System.out.print( "Çin burcunuz doğum gününüz: Sıçan" );
                break;

            case 5:
                System.out.print( "Çin burcunuz doğum gününüz: Öküz" );
                break;

            case 6:
                System.out.print( "Çin burcunuz doğum gününüz: Kaplan" );
                break;

            case 7:
                System.out.print( "Çin burcunuz doğum gününüz: Tavşan" );
                break;

            case 8:
                System.out.print( "Çin burcunuz doğum gününüz: Ejderha" );
                break;

            case 9:
                System.out.print( "Çin burcunuz doğum gününüz: Yılan" );
                break;

            case 10:
                System.out.print( "Çin burcunuz doğum gününüz: At" );
                break;

            case 11:
                System.out.print( "Çin burcunuz doğum gününüz: Keçi" );
                break;

            default:
                System.out.println("Bazı hatalar yapıyorsanız lütfen bu uygulamayı yeniden başlatın");
                break;
        }

    }
}
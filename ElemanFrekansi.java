import java.util.Arrays;
import java.util.Scanner;
public class ElemanFrekansi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] list={12,23,99,45,15,15,43,23,67,99,99,56,99,99,11,34};
        int[] count = new int[list.length];
        System.out.println("Dizi: "+ Arrays.toString(list));

        for (int i = 0; i <list.length; i++) {
            count[i]=1;
        }
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((i != j)&&(list[i]==list[j]))  {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((j!=i)&&(list[i]==list[j]) ) {
                    count[j]=count[i];
                }
            }
        }
        System.out.println("Tekrar eden sayılar");
        for (int i = 0; i< list.length ; i++) {
            if (i !=0) {
                System.out.println(list[i]+" sayısı "+count[i]+" kere tekrar edildi");
            }
        }
    }
}
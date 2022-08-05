import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sayi,n1=0,n2=1,n3;
        Scanner input = new Scanner(System.in);
        System.out.println("Serinin eleman sayisini giriniz:");
        sayi = input.nextInt();
        for (int i = 2; i <= sayi; i++) {
            n3=n1+n2;
            System.out.print(n1 + " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
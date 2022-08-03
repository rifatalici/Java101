import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sayi, girdi = 0, max = 1, min = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane sayi girmek istiyorsunuz?");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            girdi = input.nextInt();
            if (i == 1) {
                max = girdi;
                min = girdi;
            } else {
                if (girdi > max) {
                    max = girdi;
                } else if (girdi < min) {
                    min = girdi;
                }
            }
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

    }
}
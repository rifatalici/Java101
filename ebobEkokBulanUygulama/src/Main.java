import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int sayi1, sayi2, obeb = 0, okek, kucukSayi = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayiyi Giriniz:");
        sayi1 = input.nextInt();
        System.out.println("2. Sayiyi Giriniz:");
        sayi2 = input.nextInt();

        if (sayi1 < sayi2) {
            kucukSayi = sayi1;
        } else kucukSayi = sayi2;

        for (int i = 1; i <= kucukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                obeb = i;


            }
        }
        okek= (sayi1*sayi2)/obeb;
        System.out.println("Iki Sayinin En Buyuk Ortak Boleni: "+obeb);
        System.out.println("Iki Sayinin En Kucuk Ortak Kati: "+okek);

    }
}
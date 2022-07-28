import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double kilo,boy,indeks;
        Scanner input= new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz(metre cinsinden):");
        boy= input.nextDouble();
        System.out.println("Kilonuzu Giriniz:");
        kilo= input.nextDouble();
        indeks= kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksi: " + indeks);


    }
}
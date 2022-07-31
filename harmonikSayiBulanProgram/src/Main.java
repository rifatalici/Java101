import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sayi,toplam=0.0;
        Scanner input= new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        sayi=input.nextDouble();
        for (int i=1 ; i<=sayi;i++){
            toplam += (1.0/i);
        }
        System.out.println("Sonuc: " + toplam);

    }
}
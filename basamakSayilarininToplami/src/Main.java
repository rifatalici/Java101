import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi,kalan=0,toplam=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        sayi= input.nextInt();

        while(sayi != 0){

            kalan = sayi % 10 ;
            sayi /= 10 ;


            System.out.println( kalan);

            toplam += kalan ;
        }
        System.out.println(" Basamak Sayilari Toplami " + toplam);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int sayi,us,usluSayi=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ussu Alinacak Sayiyi Giriniz:");
        sayi=input.nextInt();
        System.out.println("Us Olacak Sayiyi Giriniz:");
        us=input.nextInt();

        for (int i =1; i<=us; i++){
            usluSayi *= sayi;
        }
        System.out.println(sayi + " ussu " + us + " = " + usluSayi);

    }
}
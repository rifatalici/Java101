import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int mesafe,acılıs_ucreti=10;
        double toplam,km_ucreti=2.20;

        Scanner input=new Scanner(System.in);
        System.out.println(" Gidilecek Mesafeyi Giriniz (KM): ");
        mesafe= input.nextInt();
        toplam= mesafe* km_ucreti + acılıs_ucreti;
        if (toplam<=20){
            System.out.println(" Toplam Tutar: 20 Lira ");

        }
        else  System.out.println(" Toplam Tutar:"+ toplam+ " Lira");


    }
}
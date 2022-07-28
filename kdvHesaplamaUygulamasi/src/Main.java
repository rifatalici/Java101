import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");

        double toplam, tutar,kdv;

        Scanner input= new Scanner(System.in);
        System.out.println(" Lutfen Tutari Giriniz: ");
        tutar= input.nextDouble();
        kdv= tutar/100*18;
        toplam=  tutar+kdv;

        System.out.println(" Kdv Tutari:"+kdv+" Lira");

        System.out.println(" Kdv Dahil(%18) Toplam Tutar:"+toplam+" Lira");

    }
}
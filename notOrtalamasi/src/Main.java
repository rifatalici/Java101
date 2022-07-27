import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ---Not Ortalamsı Hesaplama--- \n matematik,fizik,kimya,türkçe,tarih,müzik");
        int matematik,fizik,kimya,türkçe,tarih,müzik;
        Scanner input= new Scanner(System.in);


        System.out.println("matematik notunuzu giriniz:");
        matematik=input.nextInt();
        System.out.println("fizik notunuzu giriniz:");
        fizik=input.nextInt();
        System.out.println("kimya notunuzu giriniz:");
        kimya=input.nextInt();
        System.out.println("türkçe notunuzu giriniz:");
        türkçe=input.nextInt();
        System.out.println("tarih notunuzu giriniz:");
        tarih=input.nextInt();
        System.out.println("müzik notunuzu giriniz:");
        müzik=input.nextInt();

        int toplam= matematik+fizik+kimya+türkçe+tarih+müzik;
        double ortalama= toplam/6;
        System.out.println("Genel Ortalamanız:"+ortalama);
        System.out.println(ortalama>=60 ? "Sınıfı Geçti": "Sınıfta Kaldı");

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik,dersSayisi=0,toplamNot=0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        matematik=input.nextInt();
        if(matematik<0 || matematik> 100) {
            System.out.println("Gecersiz Bir Not Girdin");
        }
        else
            toplamNot+=matematik;
            dersSayisi++;

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik=input.nextInt();
        if(fizik<0 || fizik> 100) {
            System.out.println("Gecersiz Bir Not Girdin");
        }
        else
            toplamNot+=fizik;
            dersSayisi++;

        System.out.println("Tukce Notunuzu Giriniz:");
        turkce=input.nextInt();
        if(turkce<0 || turkce> 100) {
            System.out.println("Gecersiz Bir Not Girdin");
        }
        else
            toplamNot+=turkce;
            dersSayisi++;

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya=input.nextInt();
        if(kimya<0 || kimya> 100) {
            System.out.println("Gecersiz Bir Not Girdin");
        }
        else
            toplamNot+=kimya;
            dersSayisi++;

        System.out.println("Muzik Notunuzu Giriniz:");
        muzik=input.nextInt();
        if(muzik<0 || muzik> 100) {
            System.out.println("Gecersiz Bir Not Girdin");
        }
        else
            toplamNot+=muzik;
            dersSayisi++;

        ortalama= toplamNot/dersSayisi;
        if(ortalama<55){
            System.out.println("Ortalamaniz:"+ortalama+"\n Sinifta Kaldiniz");
        }
        else if (ortalama>=55 ){
            System.out.println("Ortalamaniz:"+ortalama+"\n Tebrikler Sinifi Gectiniz");
        }


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yas , yolcuklukTipi,toplamTutar=0,mesafe;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM Cinsinden Giriniz:");
        mesafe=input.nextInt();

        System.out.println("Yasinizi Giriniz:");
        yas=input.nextInt();
        if (yas<0){
            System.out.println("Hatali Yas Girdiniz!");

        }

        System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yon, 2=> Gidis Donus):");
        yolcuklukTipi=input.nextInt();
        switch (yolcuklukTipi){
            case 1: {
                if (yas>0 && yas<=12){
                    toplamTutar += (mesafe * 0.1) - ((mesafe * 0.1)*0.5);
                    System.out.println(toplamTutar);
                }
                else if (yas>12 && yas<=24){
                    toplamTutar += (mesafe * 0.1) - ((mesafe * 0.1)*0.1);
                    System.out.println(toplamTutar);
                }
                else if (yas>24 && yas<=65){
                    toplamTutar += (mesafe * 0.1) ;
                    System.out.println(toplamTutar);

                }
                else if (yas>65){
                    toplamTutar += (mesafe * 0.1) - ((mesafe * 0.1)*0.3);
                    System.out.println(toplamTutar);


                }
                else System.out.println("Yasi Hatali Girdiniz!");

            }
            break;
            case 2:{

                if (yas>0 && yas<=12){
                    toplamTutar += (((mesafe * 0.1) - ((mesafe * 0.1)*0.5))-(((mesafe * 0.1) - ((mesafe * 0.1)*0.5)) * 0.2)) * 2;
                    System.out.println(toplamTutar);
                }
                else if (yas>12 && yas<=24){
                    toplamTutar += (((mesafe * 0.1) - ((mesafe * 0.1)*0.1))-(((mesafe * 0.1) - ((mesafe * 0.1)*0.1)) * 0.2)) * 2;
                    System.out.println(toplamTutar);
                }
                else if (yas>24 && yas<=65){
                    toplamTutar += ((mesafe * 0.1) - (mesafe * 0.1 * 0.2)) * 2;
                    System.out.println(toplamTutar);

                }
                else if (yas>65){
                    toplamTutar += (((mesafe * 0.1) - ((mesafe * 0.1)*0.3))-(((mesafe * 0.1) - ((mesafe * 0.1)*0.3)) * 0.2)) * 2;
                    System.out.println(toplamTutar);


                }
                else System.out.println("Yasi Hatali Girdiniz!");
            }
            break;
            default: System.out.println("Hatalı Secim Yaptiniz!");


        }


    }
}
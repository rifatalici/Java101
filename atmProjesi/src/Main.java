import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String userName, password;
        int hak = 3,bakiye = 1500,secim = 0,miktar = 0;
        Scanner input = new Scanner(System.in);
        while (hak > 0) {

            System.out.println("Kullanici Adinizi Giriniz:");
            userName = input.nextLine();
            System.out.println("Parolanizi Giriniz:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Kodluyoruz Bank'a Hosgeldin " + userName);



                    do {
                        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz ");
                        System.out.println(" 1) Para Yatirma \n 2) Para Cekme \n 3) Bakiye Sorgulama \n 4) Cikis Yap");
                        secim=input.nextInt();
                        switch (secim){
                            case 1:
                                System.out.println("Ne kadar Para Yatirmak Istiyorsunuz?");
                                miktar=input.nextInt();
                                bakiye+=miktar;
                                System.out.println("Islem Tamamlandi");

                                break;
                            case 2:
                                System.out.println("Ne kadar Para Cekmek Istiyorsunuz?");
                                miktar=input.nextInt();
                                if (bakiye-miktar>=0){
                                    bakiye-=miktar;
                                    System.out.println("Islem Tamamlandi");

                                }
                                else System.out.println("Bakiye Yetersiz!");

                                break;
                            case 3:
                                System.out.println("Bakiyeniz:"+bakiye);

                                break;
                            case 4:
                                System.out.println("Iyi Gunler Tekrar Bekleriz");

                                break;


                        }
                    }
                    while (secim!=4);




                break;
            } else {
                hak--;
                System.out.println("Kullanici adi veya Sifre Hatali!");
                if (hak == 0) {
                    System.out.println("3 Defa Yanlis Girdin. Kartin Bloke Oldu!");
                } else
                    System.out.println("Kalan Hakkin: " + hak + "\n");

            }
        }


    }
}
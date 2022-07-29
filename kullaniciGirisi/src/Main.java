import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String username,password,newUsername,newPassword;
        int choise;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Adinizi Giriniz:");
        username= input.nextLine();
        System.out.println(" Sifrenizi Giriniz:");
        password= input.nextLine();
        if(username.equals("admin") && password.equals("admin1234")){

            System.out.println("Giris Basarili Hosgeldin " + username);
        }
        else {
            System.out.println("Kullanici Adi veya Sifre Yanlis \n");
        System.out.println("Kullanici Adinizi ve Sifrenizi Degistirmek Ister Misiniz? 1) EVET 2) HAYIR");
        choise=input.nextInt();
        switch (choise){
            case 1:
                System.out.println("Yeni Kullanici Adinizi Giriniz:");
                Scanner inp= new Scanner(System.in);
                newUsername = inp.nextLine();

                if (newUsername==username){
                    System.out.println(" Kullanici Adiniz Onceki Ile Ayni Lütfen Yeni Bir Kullanici Adi Giriniz");
                }
                else System.out.println("Kullanici Adiniz Basariyla Degistirildi");

                System.out.println("Yeni Sifrenizi Giriniz:");
                newPassword=inp.nextLine();

                if (newPassword==password){
                    System.out.println("Sifreniz Onceki Ile Ayni Lütfen Yeni Bir Sifre Giriniz");
                }
                else System.out.println("Sifreniz Basariyla Degistirildi");
                System.out.println("\nHosgeldin " + newUsername);
                break;
            case 2:
                System.out.println("Giris Basarisiz Lutfen Bilgilerinizi Kontrol Ediniz");
        }
            }
    }
}
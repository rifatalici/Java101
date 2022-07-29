import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1,num2, choice;
        double sum;

        Scanner input=new Scanner(System.in);
        System.out.println("1. Sayiyi Giriniz:");
        num1=input.nextInt();
        System.out.println("2. Sayiyi Giriniz:");
        num2=input.nextInt();
        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz \n (\n Toplama Islemi Icin 1 \n Cikarma Islemi Icin 2 \n Carpma Islemi Icin 3 \n Bolme Islemi Icin 4 \n)");
        choice=input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Islemin Sonucu:"+ (num1+num2));
            break;
            case 2:
                System.out.println("Islemin Sonucu:" + (num1-num2));
                break;
            case 3:
                System.out.println("Islemin Sonucu:" + (num1*num2));
                break;
            case 4:
                System.out.println("Islemin Sonucu:" + (num1/num2));
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz!");

        }



    }
}
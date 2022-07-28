import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double pi=3.14,r,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Yaricapi Giriniz:");
        r= input.nextDouble();
        alan= pi*(r*r);
        cevre= 2*pi*r;
        System.out.println("Dairenin Alani: "+ alan);
        System.out.println("Dairenin Cevresi: "+cevre);

    }
}
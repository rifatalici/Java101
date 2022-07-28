import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,toplam;
        int armut_kilo ,elma_kilo ,domates_kilo ,muz_kilo ,patlican_kilo ;
        Scanner input= new Scanner(System.in);
        System.out.println("Armut kac kilo?");
        armut_kilo = input.nextInt();
        System.out.println("Elma kac kilo?");
        elma_kilo = input.nextInt();
        System.out.println("Domates kac kilo?");
        domates_kilo = input.nextInt();
        System.out.println("Muz kac kilo?");
        muz_kilo = input.nextInt();
        System.out.println("Patlican kac kilo?");
        patlican_kilo = input.nextInt();
        toplam= (armut * armut_kilo) + (elma * elma_kilo) + (domates * domates_kilo) + (muz * muz_kilo) + (patlican * patlican_kilo);
        System.out.println("Toplam Tutar:" + toplam);


    }
}
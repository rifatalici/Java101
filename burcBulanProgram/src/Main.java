import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int gun,ay;
        Scanner input= new Scanner(System.in);
        System.out.println("Dogum Gununuzu Giriniz:");
        gun= input.nextInt();
        System.out.println("Dogum Ayinizi Giriniz:");
        ay= input.nextInt();

        if (  (gun>=21 && gun<=31 && ay==3) || (gun>=1 && gun<=20) && ay==4       ){
            System.out.println("Koc Burcusunuz");
        }
        else if (  (gun>=21 && gun<=30 && ay==4) || (gun>=1 && gun<=21) && ay==5  ){
            System.out.println("Boga Burcusunuz");
        }
        else if (  (gun>=22 && gun<=31 && ay==5) || (gun>=1 && gun<=22) && ay==6  ){
            System.out.println("Ikizler Burcusunuz");
        }
        else if (  (gun>=23 && gun<=30 && ay==6) || (gun>=1 && gun<=22) && ay==7  ){
            System.out.println("Yengec Burcusunuz");
        }
        else if (  (gun>=23 && gun<=31 && ay==7) || (gun>=1 && gun<=22) && ay==8  ){
            System.out.println("Aslan Burcusunuz");
        }
        else if (  (gun>=23 && gun<=31 && ay==8) || (gun>=1 && gun<=22) && ay==9  ){
            System.out.println("Basak Burcusunuz");
        }
        else if (  (gun>=23 && gun<=30 && ay==9) || (gun>=1 && gun<=22) && ay==10  ){
            System.out.println("Terazi Burcusunuz");
        }
        else if (  (gun>=23 && gun<=31 && ay==10) || (gun>=1 && gun<=22) && ay==11  ){
            System.out.println("Akrep Burcusunuz");
        }
        else if (  (gun>=22 && gun<=30 && ay==11) || (gun>=1 && gun<=21) && ay==12  ){
            System.out.println("Yay Burcusunuz");
        }
        else if (  (gun>=22 && gun<=31 && ay==12) || (gun>=1 && gun<=21) && ay==1  ){
            System.out.println("Oglak Burcusunuz");
        }
        else if (  (gun>=22 && gun<=31 && ay==1) || (gun>=1 && gun<=19) && ay==2  ){
            System.out.println("Kova Burcusunuz");
        }
        else if (  (gun>=20 && gun<=28 && ay==2) || (gun>=1 && gun<=20) && ay==3  ){
            System.out.println("Boga Burcusunuz");
        }
    }
}
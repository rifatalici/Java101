import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int satirSayisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Elmasin Orta Noktasi Kacinci Satirda Olsun?)");
        satirSayisi=input.nextInt();

        for (int i=1; i <= satirSayisi; i++){
            for (int j=1; j <= satirSayisi-i; j++){
                System.out.print(" ");
            }

            for (int k=1; k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }


       //-----------
        for (int i = 0; i <= satirSayisi; i++) {

            for (int j = satirSayisi-1; j >= ((satirSayisi-1)- i); j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * ((satirSayisi-1) - i) - 1) ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
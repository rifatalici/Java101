import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz:");
        sayi=input.nextInt();
        System.out.println("4'un Kuvvetleri");
        for (int i=1;i<sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("\n5'in Kuvvetleri");
        for (int i=1;i<sayi;i*=5){
            System.out.println(i);
        }
    }
}
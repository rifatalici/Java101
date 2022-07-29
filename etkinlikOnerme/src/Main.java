import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        int sicaklik = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sicakigi Giriniz:");
        sicaklik= input.nextInt();

         if(sicaklik<5){
             System.out.println("Etkinlik Onerisi: Kayak");
         }
         else if (sicaklik<15 && sicaklik>5){
             System.out.println("Etkinlik Onerisi: Sinema");
         }
         else if (sicaklik<25 && sicaklik>15){
             System.out.println("Etkinlik Onerisi: Piknik");
         }
         else System.out.println("Etkinlik Onerisi: Yuzme");
    }
}
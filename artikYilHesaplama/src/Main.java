import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int yil;
       Scanner input = new Scanner(System.in);
       System.out.println("Yili Giriniz:");
       yil=input.nextInt();

       switch (yil%4){
           case 0:
               if(yil%100==0&&yil%400==0){
                   System.out.println(yil+ " Artik Bir Yildir.");
               }
               else System.out.println(yil+ " Artik Yil Degildir.");
               break;
           default: System.out.println(yil+ " Artik Yil Degildir.");

               break;
       }

    }
}
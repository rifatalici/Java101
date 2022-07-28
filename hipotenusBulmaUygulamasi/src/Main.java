import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner input= new Scanner(System.in);
        System.out.println("1. kenari giriniz:");
        a= input.nextInt();
        System.out.println("2. kenari giriniz:");
        b= input.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.println("3. kenar (hipotenus):" +c);



    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,r,c,faktoriyel_n=1,faktoriyel_r = 1,faktoriyel_nr = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac elemanli bir kume");
        n=input.nextInt();
        System.out.println("Kac elemanli farkli gruplar olsun");
        r=input.nextInt();
        for (int i=n;i>=1;i--){
            faktoriyel_n *=i;
        }
        for (int i=r;i>=1;i--){
            faktoriyel_r *= i;
        }
        for (int i=(n-r);i>=1;i--){
            faktoriyel_nr *= i;
        }
        c=   faktoriyel_n / (faktoriyel_r*faktoriyel_nr);
        System.out.println(n + " elamanli bir kumenden olusturabilecek " + r + " elemanli farkli kume sayisi: "+ c + " tanedir.");

    }
}
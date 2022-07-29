import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a,b,c,enBuyuk,enKucuk,ortanca;
        Scanner input= new Scanner(System.in);
        System.out.println(" 1. Sayiyi Giriniz:");
        a=input.nextInt();
        System.out.println(" 2. Sayiyi Giriniz:");
        b=input.nextInt();
        System.out.println(" 3. Sayiyi Giriniz:");
        c=input.nextInt();

        enKucuk=a;
        enBuyuk=b;
        ortanca=c;

        if (b>a && c>a){
            enKucuk=a;
        }
        else if(a>b && c>b){
            enKucuk=b;
        }
        else if(a>c && b>c){
            enKucuk=c;
        }
        System.out.println(" En Kucuk Sayi:" + enKucuk);
        if (b<a && c<a){
            enBuyuk=a;
        }
        else if(a<b && c<b){
            enBuyuk=b;
        }
        else if(a<c && b<c){
            enBuyuk=c;
        }
        System.out.println(" En Buyuk Sayi:" + enBuyuk);


        if ((b<a && c>a) || (c<a && b>a)){
            ortanca=a;
        }
        else if((a<b && c>b) || (c<b && a>b)){
            ortanca=b;
        }
        else if((a<c && b>c) || (b<c && a>c)){
            ortanca=c;
        }
        System.out.println(" Ortanca Sayi:" + ortanca);
        System.out.println(" "+enBuyuk+">"+ortanca+">"+enKucuk);
    }
}
package JavaPrograms;


import java.util.Scanner;

public class currencyExcahngeRate {
//    Input currency in rupees and output in USD.

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter inr: ");
        int inr=in.nextInt();
        System.out.println("Enter $: ");

        int usd=in.nextInt();
        System.out.println("Enter 1  if you exhange into usd  Enter 0 if u exchange in inr: ");
        int  convert =in.nextInt();
        int ans = currencyConverter( inr, usd,convert );
        System.out.println("your Exchange Rate: "+ans);
    }

     static int currencyConverter(  int inr, int usd,int convert) {
        int ExchangeRate=0;
        if(convert==1){
//            int ExchangeRate=0;
            ExchangeRate=inr/usd;
            return ExchangeRate;

        } else if (convert==0) {
//            int ExchangeRate;
            ExchangeRate =inr*usd;
            return ExchangeRate;

        }
         return ExchangeRate;

     }
}

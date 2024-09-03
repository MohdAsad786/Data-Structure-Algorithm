package JavaPrograms;

import java.util.Scanner;

public class FibbonaciNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter n index fibbonaci number: ");
        int n= in.nextInt();
        int ans = fibbonacinumbercalc(n);
        System.out.println("on n index fibbonaci numbers is: "+ans);
    }
  static int  fibbonacinumbercalc(int n){
        int prev=0;
        int next=1;

        int count=2;
        while (count<=n){
            int temp=next;
            next+=prev;
            prev=temp;
            count++;
        }
      return next;
  }
}

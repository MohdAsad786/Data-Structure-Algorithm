package JavaPrograms;

import java.util.Scanner;

public class FindSimpleInterest {
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter your principal ammount : ");
    int principalAmmount=in.nextInt();
    System.out.println("enter your annualInterest Rate : ");
    int annualInterest=in.nextInt();
    System.out.println("enter your time of Ammount : ");
    int timeAmmount=in.nextInt();

  int ans= interest(principalAmmount,timeAmmount,annualInterest);
    System.out.println("your Ammount is: "+ans);

}
static int interest(int p,int r,int q){
    int ammount=p*r*q/100;
    return ammount;
}
}

package JavaPrograms;

import java.util.Scanner;
// next time  try with inbetween two numbers
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  number: ");
        int a = in.nextInt();
        int ans=findArmstrong(a);
        System.out.println("The  numbers is: "+ans);

    }

    static int findArmstrong(int a) {
        int num = a;
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;

            sum = sum + (remainder * remainder * remainder);
            num = num / 10;
        }
        if (a==sum){
            System.out.println("sum is equalto number hence # is Armstrong #");
        }else {
            System.out.println("not armstrong #");
        }
return sum;
    }
}

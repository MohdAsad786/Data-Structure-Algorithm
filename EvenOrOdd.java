package JavaPrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("number is even");
        }else {
            System.out.println("number is odd ");
        }
    }
}

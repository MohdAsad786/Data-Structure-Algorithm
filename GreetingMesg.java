package JavaPrograms;

import java.util.Scanner;

public class GreetingMesg {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = in.nextLine();

        System.out.println("God bless u "+name);

    }
}

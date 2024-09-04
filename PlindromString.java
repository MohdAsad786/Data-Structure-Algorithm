package JavaPrograms;

import java.util.Scanner;

public class PlindromString {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = in.nextLine();
        int i = 0;
        int j= s.length()-1;
        while (i<j){
            if(s.charAt(i)!= s.charAt(j)){
                System.out.println("string is not palindrom ");
            }
            i++;
            j--;
        }
    }
}

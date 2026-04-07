package chapter3;

import java.util.Scanner;

public class task4 {
public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a valid string: ");
    String input = scanner.next();
StringBuilder str = new StringBuilder(input);
scanner.close();
isAPalindrome(str);
}

  static void isAPalindrome(StringBuilder str){
        String original = str.toString();
        String reverseStr = str.reverse().toString();
        if (reverseStr.equals(original)) System.out.println("The input string is a palindrome");
        else System.out.println("The input string is not a palindrome");
    }
    
}

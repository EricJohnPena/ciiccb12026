package chapter3;

import java.util.Scanner;

public class task4 {
public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a valid string: ");
    String input = scanner.next();

scanner.close();
isAPalindrome(input);
//IsAPalindrome(input);
}

  static void isAPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        String reverseStr = sb.reverse().toString();
        if (reverseStr.equals(word)) System.out.println("The input string is a palindrome");
        else System.out.println("The input string is not a palindrome");


    }

    ///////////////////////////ternary////////////////////////////////////////
    static void IsAPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
	String result = (sb.toString().equalsIgnoreCase(sb.reverse().toString())?"Is a palindrome":"Is not a palindrome");
	System.out.println(result);
    }
    
}

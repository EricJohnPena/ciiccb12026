package test;

public class StringBuilderLesson {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb2.append("World");
        System.out.println(sb.toString());
	IsAPalindrome("nasabayabasan");
    }

    static void IsAPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
	String result = (sb.toString().equalsIgnoreCase(sb.reverse().toString())?"Is a palindrome":"Is not a palindrome");
	System.out.println(result);
    }
}

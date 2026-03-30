package test;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        boolean cont = true;
        while(cont){
        System.out.println("Enter three numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        
        if(a==b && b==c)System.out.println("All numbers are equal");
        else{
            int last_num = a;
            if(b>last_num)last_num = b;
            if(c>last_num)last_num = c;

            System.out.println("The largest number is:" + last_num);
        }
        
    }
            
        

    //    String result = (a==b && b==c) ? "All numbers are equal." :
    //                      int last_num = a
    //                     (b>last_num)?last_num=b
    //                     (c>last_num)?last_num=c
    //                     ("The largest number is:" + last_num); 
    //     System.out.println(result);
  
   
    }
}


package chapter3;

import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        boolean cont = true;

        while(cont)
        {
            System.out.println("Enter three numbers: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();


            if (a == b && b == c)
                System.out.println("All numbers are equal");
            else {
                int last_num = a;
                if (b > last_num) last_num = b;
                if (c > last_num) last_num = c;

                System.out.println("The largest number is:" + last_num);
            }
            System.out.println("Do you want to continue? y/n");
            String opt = scanner.next();
            cont = !opt.equalsIgnoreCase("n");
        }
    }

}

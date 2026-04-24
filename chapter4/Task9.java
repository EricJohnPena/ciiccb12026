package chapter4;
import static java.lang.Math.*;
public class Task9 {

    public static int add(int a, int b){
        int sum = addExact(a,b);
        System.out.println("The sum of "+a +" and " + b + " is "+ sum);
        return sum;
    }
    public static int subtract(int a, int b){
        int difference = subtractExact(a,b);
        System.out.println("The difference of "+a +" and " + b + " is "+ difference);
        return difference;

    }
    public static int multiply(int a, int b){
        int product = multiplyExact(a,b);
        System.out.println("The product of "+a +" and " + b + " is "+ product);
        return product;

    }
    public static float divide(int a, int b){
        float quotient = divideExact(a,b);
        System.out.println("The quotient of "+a +" and " + b + " is "+ quotient);
        return quotient;

    }

    static void main() {
        int a = 6;
        int b = 7;

        add(a,b);
        subtract(a,b);
        multiply(a,b);
        divide(a,b);
    }


}

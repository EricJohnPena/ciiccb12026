package chapter4;


public class Task7 {
    static void main() {
        Task7 compute = new Task7();
        double num1 = 6;
        double num2 = 7;

        System.out.println(compute.addNum(num1,num2));
        System.out.println(compute.subtractNum(num1,num2));
        System.out.println(compute.divideNum(num1,num2));
        System.out.println(compute.multiplyNum(num1,num2));

    }

    double addNum(double num1, double num2){
        return num1 + num2;
    }
    double subtractNum(double num1, double num2){
        return num1 - num2;
    }
    double divideNum(double num1, double num2){
        return num1 / num2;
    }
    double multiplyNum(double num1, double num2){
        return num1 * num2;
    }


}

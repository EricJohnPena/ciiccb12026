package chapter4;

public class Task8 {
    static void main() {
        Task8 task = new Task8();

        System.out.println(task.sumOfAll(4,5,10));
    }

    int sumOfAll(int... numbers){
        int total = 0;
        for(int  number: numbers){
            int paramSum = 0;
            for(int i=1;i<=number; i++){
                paramSum += i;
            }
            total += paramSum;
        }
        return total;
    }
}

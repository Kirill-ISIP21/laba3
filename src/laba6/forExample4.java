package laba6;

public class forExample4 {
    static void method(int num){
        int answer = num;
        if(num%2 == 1){
            for (int i = num - 2; i - 2 >= 1; i -= 2) {
                answer *= i;
            }
        }
        else {
            for (int i = num - 2; i >= 2; i -= 2) {
                answer *= i;
            }
        }
        System.out.println("Двойной факториал числа " + num + " равен - " + answer);
    }
}

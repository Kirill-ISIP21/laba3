package laba6;

public class forExample5 {
    static void method(int num){
        int answer = 0;
        for (int i = 1; i <= num; i++){
            answer += i*i;
        }
        System.out.println("Сумма квадратов данного числа равна: " + answer);
    }
}

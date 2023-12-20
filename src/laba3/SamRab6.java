package laba3;
import java.util.Scanner;
public class SamRab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве: ");
        int size;
        try {
            size = in.nextInt();
            if (size==0){
                System.out.println("Массива не буит");
            }
        int []array = new int[size];
        for (int i = 0; i < size; i++) array[i] = 2 + 5*i;
        for (int i = 0; i < size; i++) System.out.print(array[i] + " ");
        }catch (Exception e){
            System.out.println("Вы ввели некоректное значение");
        }
    }
}

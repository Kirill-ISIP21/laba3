package laba3;
import java.util.Scanner;
public class SamRab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве: ");
        int size = in.nextInt();
        int[] array = new  int[size];
        int sum = 0;
        int kolvo = 0;
        for (int i=0; i < size ; i++){
            System.out.println("Введите " + (i+1) + " число: ");
            array[i] = in.nextInt();
            if (array[i] % 5 == 2 || array[i] % 3 == 1)
            {
                kolvo++;
                sum += array[i];
            }
            else System.out.println("Число не попадает под требования");
        }
        System.out.println("Количество удволетворяющих чисел: " + kolvo);
        System.out.println("Сумма чисел: " + sum);
        }
    }


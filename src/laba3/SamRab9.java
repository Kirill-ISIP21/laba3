package laba3;
import java.util.Random;
public class SamRab9 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            Random rnd = new Random();
            array[i]= rnd.nextInt(200);
            System.out.print(array[i]+" ");
        }
        int min=201;
        int index=0;
        for (int i = 0; i < array.length; i ++){
            if (array[i]<min){
                min=array[i];
                index=i;
            }
        }
        System.out.println();
        System.out.println("Минимальное число: " + min);
        System.out.println("Индекс: " + index);
    }
}

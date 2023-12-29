package laba4;

public class Example2 {
    public static void main(String[] args) {
        int figure=10;
        int i, j, z;
        for (i=0;i<=figure;i++){
            //System.out.print("номер строки "+i+" ");
            z=0;
            for (j=0;j<i;j++){

                System.out.print("+");
                z=z+1;
            }
            System.out.println(" Кол-во символов в строке "+z);
        }

    }
}

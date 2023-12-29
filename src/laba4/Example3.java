package laba4;

public class Example3 {
    public static void main(String[] args) {
        int figure = 10;
        int[][] rectangle = new int[figure][2*figure];
        for (int i = 0; i < figure; i++)
        {
            for (int j = 0; j < 2*figure; j++)
            {
                rectangle[i][j] = 2;
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }

}

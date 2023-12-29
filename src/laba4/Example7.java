package laba4;

public class Example7 {
    public static void main(String[] args) {
        int figure = 10;
        int[][] rectangle = new int[figure][figure];
        for (int i = 0; i < figure; i++)
        {
            for (int j = 0; j < figure; j++)
            {
                rectangle[i][(i % 2 == 0 ? j: (figure - j - 1))] = 2;
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

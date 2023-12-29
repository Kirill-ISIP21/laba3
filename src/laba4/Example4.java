package laba4;

public class Example4 {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j <= i; j++) {
                triangle[i] = new int[j];
            }
        }
        for(int[] x: triangle)
        {
            for (int y: x) System.out.print(y);
            System.out.println();
        }
    }
}

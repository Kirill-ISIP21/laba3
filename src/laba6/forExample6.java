package laba6;

public class forExample6 {
    public static int[] method(int[] arr, int num){
        int answer[] = new int[num];
        for (int i = 0; i < num; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}

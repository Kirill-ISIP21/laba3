package laba6;

public class forExample10 {
    public static int[] method(String text){
        String[] arrStr = text.split(" ");
        int[] answer = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            answer[i] = Integer.parseInt(arrStr[i]);
        }
        int[] result = new int[2];
        result[0] = 0;
        result[1] = answer[0];
        for (int j : answer) {
            if (j > result[0]) {
                result[0] = j;
            } else if (result[1] > j) {
                result[1] = j;
            }
        }
        return  result;
    }
}

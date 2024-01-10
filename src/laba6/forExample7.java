package laba6;

public class forExample7 {
    public static int[] method(String text){
        char[] splitText = text.toCharArray();
        int[] answer = new int[splitText.length];
        for (int i = 0; i < splitText.length; i++) {
            answer[i] = splitText[i];
        }
        return answer;
    }
}

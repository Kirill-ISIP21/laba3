package laba3;

public class SamRab8 {
    public static void main(String[] args) {
        char ch1 = 65;
        char []array = new char[10];
        for (int i = 0; i < 10;){
            if(ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U' || ch1 == 'Y')
            {
                ch1++;
            }
            else
            {
                array[i] = ch1;
                i++;
                ch1++;
            }
        }
        for (int i = 0; i < 10; i++) System.out.print(array[i]);
    }
}

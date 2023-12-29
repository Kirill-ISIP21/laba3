package laba4;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для шифровки: ");
        String cipher = in.nextLine();
        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        char[] newCipher = cipher.toCharArray();
        for (int i = 0; i < newCipher.length; i++) {
            newCipher[i] = (char) (newCipher[i] + key);
        }
        cipher = new String(newCipher);
        System.out.println(cipher);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        char answer = in.next().charAt(0);
        while (answer != 'n') {
            if (answer == 'y') {
                for (int i = 0; i < newCipher.length; i++) {
                    newCipher[i] = (char) (newCipher[i] - key);
                }
                cipher = new String(newCipher);
                System.out.println(cipher);
                break;
            } else {
                System.out.println("Введите корректный ответ.");
                answer = in.next().charAt(0);
            }
        }
        System.out.println("Спасибо!");
    }
}

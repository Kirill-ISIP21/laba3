package laba12;

public class Example4 {
    public static void main(String[] args) {
        // Создаем 10 потоков
        for (int i = 1; i <= 10; i++) {
            // Создаем новый поток, передавая номер потока в конструктор
            Thread thread = new Thread(new MyThread(i));
            // Запускаем поток
            thread.start();
        }
    }

    // Внутренний класс для реализации интерфейса Runnable
    static class MyThread implements Runnable {
        private int number;

        // Конструктор класса MyThread
        public MyThread(int number) {
            this.number = number;
        }

        // Метод run, который будет выполняться при запуске потока
        @Override
        public void run() {
            // Выводим номер потока
            System.out.println("Thread number: " + number);
        }
    }
}

package laba12;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        // Создаем новый поток
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                // Выводим число i на экран
                System.out.println(i);
                try {
                    // Приостанавливаем поток на 1 секунду
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Запускаем поток
        t.start();

        // Ожидаем завершения потока t
        t.join();
    }
}

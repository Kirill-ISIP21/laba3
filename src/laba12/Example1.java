package laba12;

import java.time.LocalTime;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        // Создаем поток t1
        Thread t1 = new Thread(() -> {
            // В потоке t1 выводим время, задержка между выводами 1 секунда, всего 10 раз
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Создаем поток t2
        Thread t2 = new Thread(() -> {
            // В потоке t2 выводим время, задержка между выводами 1 секунда, всего 10 раз
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Запускаем потоки t1 и t2
        t1.start();
        t2.start();

        // Ожидаем завершения потоков t1 и t2, чтобы главный поток (main) завершился последним
        t1.join();
        t2.join();
    }
}

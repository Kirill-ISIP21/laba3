package laba12;

public class Example3 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        // Создаем поток для четных чисел
        Thread evenThread = new Thread(() -> {
            // Блокируемся на объекте lock
            synchronized (lock) {
                // Пока число меньше 10
                while (number <= 10) {
                    // Если число четное, выводим его и увеличиваем на 1
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            // Если число нечетное, ждем оповещения о продолжении работы от другого потока
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Оповещаем другой поток о готовности к работе
                    lock.notifyAll();
                }
            }
        });

        // Создаем поток для нечетных чисел
        Thread oddThread = new Thread(() -> {
            // Блокируемся на объекте lock
            synchronized (lock) {
                // Пока число меньше 10
                while (number <= 10) {
                    // Если число нечетное, выводим его и увеличиваем на 1
                    if (number % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    } else {
                        try {
                            // Если число четное, ждем оповещения о продолжении работы от другого потока
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Оповещаем другой поток о готовности к работе
                    lock.notifyAll();
                }
            }
        });

        // Задаем имена потокам
        evenThread.setName("Чет");
        oddThread.setName("Нечет");

        // Запускаем потоки
        evenThread.start();
        oddThread.start();
    }
}

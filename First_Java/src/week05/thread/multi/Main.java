package week05.thread.multi;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("$");
            }

        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("*");
            }
        };

        // 결과값은 우리가 보장할 수 없다.
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

    }
}

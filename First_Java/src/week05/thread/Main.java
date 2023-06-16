package week05.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread 구현");

//        TestThread thread1 = new TestThread();
//        thread1.start();
//
//        Runnable run = new TestRunnable();
//        Thread thread2 = new Thread(run);
//        thread2.start();

        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + "  " + sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);

        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();


        System.out.println("프로그램 종료");
    }
}

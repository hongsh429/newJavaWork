package week05.thread.stat.interrupt;

//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                try {
//                    /* sleep 도중 interrupt 발생 시, catch! */
//                    Thread.sleep(1000);
//                    System.out.println(Thread.currentThread().getName());
//                } catch (InterruptedException e) {
//                    /* sleep 단계에서 interrupt 되면, exception을 발생시킴!! */
//                    break;
//                }
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread"); // NEW
//        thread.start(); // NEW -> RUNNABLE
//
//        thread.interrupt();
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}

/* while (!Thread.currentThread().isInterrupted()) 가 있는 것 없는것으로 구분 */
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}

package week05.thread.demon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i+"번 째 demon");

            }
        };

        // 우선 순위가 낮다! => 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당받는다. 프로세스로 부터!
        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i+"번째 task");
        }
    }
}

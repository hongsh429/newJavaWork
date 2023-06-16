package week04.homework;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;
        // 구현 2.

        while (!calculateEnded) {
            try {
                CalculatorApp.start();
                calculateEnded = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


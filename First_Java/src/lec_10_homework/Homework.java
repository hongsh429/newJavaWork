package lec_10_homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String recipe = sc.nextLine();
        sb.append("[ ").append(recipe).append(" ]").append("\n");

        double reviewNum = sc.nextDouble();
        sc.next();

        sb.append("별점 : ").append((int) reviewNum).append(" (").append((int) reviewNum / 5.0 * 100).append(")\n");
        for (int i = 1; i <= 10; i++) {
            sb.append(i).append(". ").append(sc.nextLine()).append("\n");
        }


        System.out.println(sb.toString());


        sc.close();
    }
}

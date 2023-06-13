package week2_homework;


import java.util.*;

public class TeamWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 서로 다른 3개의 숫자를 기억하는 것만들기
        Set<Integer> set = new HashSet<>();
        while (true) {
            if(set.size() == 3) break;
            set.add((int) (Math.random() * 10));
        }
        List<Integer> list = new ArrayList<>(set);

        System.out.println("list = " + list);


        int ball;
        int strike = 0;
        int count = 0;
        String input;
        while (true) {

            if(strike == 3) {
                System.out.printf("%d번 만에 맞히셨습니다\n", count);
                System.out.println("게임을 종료합니다.");
                break;
            }
            strike = 0;
            ball = 0;
            count++;

            System.out.print(count + "번째 시도 : ");
            input = sc.next();

            String[] inputArr = input.split("");

            for (int i = 0; i < inputArr.length; i++) {
                int num = Integer.parseInt(inputArr[i]);
                if (list.contains(num)) {
                    if(list.get(i) == num) strike += 1;
                    else ball += 1;
                }
            }
            System.out.println(ball + "B" + strike + "S");

        }
        sc.close();
    }
}

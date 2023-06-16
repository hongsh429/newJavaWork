package week2_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TeamWorkMain {
    public static void main(String[] args) {
        Random random = new Random();
        /* 중복을 허용하지 않는 랜덤 숫자 3개를 만드는 메소드 */
        int[] computerNumber = generateCompterNumber(random);
        System.out.println("computerNumber = " + Arrays.toString(computerNumber));

        System.out.println("숫자 맞추기 게임을 시작합니다!");

        while (true) {
            int[] userNumber = getUserNumber(); /* userNumber = { 3, 6, 4 } */
            int[] result = calculateResult(computerNumber, userNumber);
            System.out.println("결과: " + result[0] + "S " + result[1] + "B");

            // while문 종료 조건
            if (result[0] == 3) {
                System.out.println("축하합니다! 숫자를 모두 맞추셨습니다.");
                break;
            }// end if
        }//end while
    }

    // 컴퓨터가 무작위로 숫자 3개를 선택하는 메서드
    public static int[] generateCompterNumber(Random random) {
        int[] numbers = new int[3]; // 리턴해주는 배열
        boolean[] isUsed = new boolean[10]; // 0 ~ 9의 숫자가 한번이라도 사용이 되었는지 확인하는 배열
         Arrays.fill(isUsed, false); // 배열의 모든 값을 false값으로 만들어주는 메소드
//        [false, false, false, true, false, false, false, false, true, true]
        /*   0      1       2      3      4     5       6      7      8     9*/
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(10); /* num = 9 , num = 9, num = 3*/

            while (isUsed[num]) {  // 이미 들어온 숫자인지를 확인하기 위해 만든 반복문
                num = random.nextInt(10); /* num = 8 */
            }

            numbers[i] = num;   // number[] = {9, 8, 3}
            isUsed[num] = true;
        }

        return numbers;
    }

    // 사용자로부터 입력을 받아 세 자리 숫자를 반환하는 메서드
    public static int[] getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("세 자리 숫자를 입력하세요: ");
        String input = scanner.nextLine();  /* "364" */

        int[] numbers = new int[3]; /* { 3, 6, 4 } */
        for (int i = 0; i < 3; i++) {
                                                        /* '3' '6' */
            numbers[i] = Character.getNumericValue(input.charAt(i));  /* '6'  -> 6 */
        }

        return numbers;
    }

    // 결과를 계산하는 메서드

    /* computerNumber = {9, 8, 3} */
    /* userNumber = { 3, 8, 4 } */
    public static int[] calculateResult(int[] computerNumber, int[] userNumber) {
        int[] result = new int[2];  /*{ ?, ? }*/
        Arrays.fill(result, 0);   /*{ 0, 1 }*/

        for (int i = 0; i < 3; i++) {
            if (computerNumber[i] == userNumber[i]) { // pass
                result[0]++; // 스트라이크
                                       /*  {9, 8, 3}             3    */
            } else if (containsNumber(computerNumber, userNumber[i])) {
                result[1]++; // 볼
            }
        }

        return result;
    }

    // 배열에서 특정 숫자를 포함하는지 확인하는 메서드

                                     /*  {9, 8, 3}             3    */
    public static boolean containsNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}

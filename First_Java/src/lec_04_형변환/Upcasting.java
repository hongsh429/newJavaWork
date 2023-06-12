package lec_04_형변환;

public class Upcasting {
    public static void main(String[] args) {
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double형 or float형 -> int
        // 실수 -> 정수(0.xxx -> 0)
        double doubleNumber = 10.1010;
        float floatNumber = 10.1010f;

        // 변환(int)
        int intNumber;
        intNumber = (int) doubleNumber;
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("intNumber = " + intNumber);

        // 변환(int) float
        intNumber = (int) floatNumber;
        System.out.println("intNumber = " + intNumber);
        System.out.println("floatNumber = " + floatNumber);
        System.out.println();

        System.out.println("upcasting, 명시적 형변환");
        int intNumber2 = 10;
        double doubleNumber2 = (double) intNumber2;
        float floatNumber2 = (float) intNumber2;
        System.out.println("intNumber2 = " + intNumber2);
        System.out.println("floatNumber2 = " + floatNumber2);
        System.out.println("doubleNumber2 = " + doubleNumber2);
    }
}

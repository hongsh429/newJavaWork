package lec_04_형변환;

public class AutoCasting {
    public static void main(String[] args) {
        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) because: 부동소수점 -> double(8)

        // byte(1) byte -> int
        byte byteNumber = 10;
        int intNumber = byteNumber;
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("intNumber = " + intNumber);
        System.out.println();

        // (2) char(1 byte) -> int
        char charAlphabet = 'A';
        intNumber = charAlphabet;
        System.out.println(intNumber);

        // int -> long number 형변환
        intNumber = 100;
        long longNumber = intNumber;
        System.out.println(intNumber);

        // (4) int -> double 형 변환 (자동 형변환)
        intNumber = 200;
        double doubleNumber = intNumber;
        System.out.println("doubleNumber = " + doubleNumber);

        // 작은 크기의 타입이 큰 크기의 타입과 '계산'될 때,
        // 자동으로 큰 크기의 타입으로 형 변환이 됩니다.
        int intNumber2 = 10;
        double doubleNumber2 = 5.5;
        double xSum = intNumber2 + doubleNumber2;
        System.out.println(xSum);

        System.out.println();
        // 1) 정수로 나누기
        int intResult = intNumber / 3;
        // 2) 실수로 나누기
        double doubleResult = intNumber / 3.0;

        System.out.println("intResult = " + intResult);
        System.out.println("doubleResult = " + doubleResult);

    }
}

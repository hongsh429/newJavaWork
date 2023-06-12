package lec_02_variables;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 우리의 플레이 그라운드

        // (1) boolean
        System.out.println("(1) boolean");
        // 변수를 선언해보자 => 타입 이름 값;

        // 선언 + 할당
        boolean flag1 = true;

        // 선언
        boolean flag2;
        // 할당
        flag2 = true;


        System.out.println("flag1 = " + flag1);
        System.out.println("flag2 = " + flag2);
        System.out.println();

        // (2) 문자형(char)
        System.out.println("(2) 문자형(char)");
        char alphabet = 'A';
        System.out.println("alphabet = " + alphabet);
        System.out.println();

        // (3) 정수형(byte, short, int, long)
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNumber = Integer.MAX_VALUE;
        long longNumber = intNumber;

        System.out.println("byteNumber = " + byteNumber);
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("intNumber = " + intNumber);
        System.out.println("longNumber = " + longNumber);

        // 1byte = 8bit
        // bit : 0 과 1을 표현
        // bite -> 1byte : 2^8까지 표현가능
        System.out.println("bite : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("(4) 실수형");
        // float(4byte), double(8byte)
        System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MIN_VALUE);
        System.out.println("Double : " + Double.MIN_VALUE + " ~ " + Double.MIN_VALUE);

        System.out.println();

        System.out.println("참조형 변수");
        String helloWorld = "Hello, World!";
        System.out.println(helloWorld);

        System.out.println("배열");

        //배열
        int[] intArr = {1, 2, 3};
        System.out.println(Arrays.toString(intArr));
        System.out.println();

        System.out.println("wrapper 클래스");
        // Primitive의 Wrapper 클래스의 가장 큰 특징은 null을 저장할 수 있다는 것!✨✨✨✨
        int number = 21;
        Integer numAuto = number;   // auto-boxing
        Integer numBoxing = Integer.valueOf(number); // boxing
        System.out.println(numBoxing.intValue()); // unboxing

        System.out.println(numBoxing);    // auto-unboxing

    }
}

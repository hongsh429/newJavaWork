package lec_01_print;


// 클래스
// public : (접근)제어자, public(공공의, 공통의)
// 이러한 public 클래스의 이름은 .java 파일명과 일치시켜야 한다.
public class Main {

    // [JDK]
    // (1) compiler : .java -> .class
    // class loader
    // (2) JRE
    // (3) JDB : 디버깅




    // 메인 메소드
    // 자바 프로젝트(앱)은. 제일 먼저 클래스의 main 메소드를 실행시킨다
    // == JVM의 약속

    // static : 프로그램이 시작이 될 때, 메모리에 미리 올라가는 것

    // output
    // void : 메서드의 출력값의 데이터 타입
    // void : "아무것도 없다" -> 출력은 없다.

    // input
    // String[] args : 매개변수자리
    public static void main(String[] args) {

        // 객체 : 특징(속성, 변수), 행동(메소드)
        // 클래스.static 객체.메소드
        System.out.println("hello, java");

        // print : 줄바꿈 x
        // println : 줄바꿈 o / ln = line
        System.out.print("Our First ");
        System.out.println("Project! :)");
        System.out.println("다음줄");

        // 과제
        // 1. 7
        // 2. 3
        // 3. 3.14
        // 4. JAVA
        System.out.println(7);
        System.out.println(3);
        System.out.println(3.14);
        System.out.println("JAVA");
    }
}


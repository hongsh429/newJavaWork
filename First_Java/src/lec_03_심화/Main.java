package lec_03_심화;

// 문자형 vs 문자열 : 문자열의 마지막은 \0 (null) 값이 마지막에 붙게 된다.

// 참조형 vs 원시형
/*
메모리 영역
 - stack 영역 : 변수가 저장되는 공간
        생성 : 변수 선언시
        소멸 : 해당 블록이 끝날때
 - heap 영역 : 참조형 변수들이 생성되는 공간. new 로 생성되는 것들
        생성 : new 선언시
        소멸 : 참조가 끊길 때 -> garbage collection에 의해서 자동 소멸
 - method Area : 리터럴, 상수, static으로 선언된 것들
        생성 : 프로그램이 시작할 때,
        소멸 : 프로그램 종료 시 소멸.
 **/
public class Main {
    public static void main(String[] args) {

    }
}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    }

    public static String solution2(int a, int b) {
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        LocalDate localDate = LocalDate.of(2016, a, b);
        String day = localDate.format(DateTimeFormatter.ISO_WEEK_DATE);
        int weekNum = Integer.parseInt(day.substring(day.length()-1));
        return week[weekNum-1];
    }

    public String solution(int a, int b) {
        String answer = "";

        int prev_day_sum = 0;

        String[] YO = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int yo_cnt = 0;

        int x = 1;
        int y = 1;

        while (x != a || y != b) {

            if (yo_cnt + 1 <= 6) {
                yo_cnt += 1;
            } else {
                yo_cnt = 0;
            }


            if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
                if (y < 31) {
                    y++;
                } else {
                    x++;
                    y = 1;
                }

            } else if (x == 4 || x == 6 || x == 11 || x == 9 || x == 11) {
                if (y < 30) {
                    y++;
                } else {
                    x++;
                    y = 1;
                }

            } else {
                if (y < 29) {
                    y++;
                } else {
                    x++;
                    y = 1;
                }
            }


        }

        answer = YO[yo_cnt];

        return answer;
    }
}





















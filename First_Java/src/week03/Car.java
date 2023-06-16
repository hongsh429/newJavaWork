package week03;

/*

클래스 만들기 위한 4가지 스텝

1. 만들려고하는 설계도를 선언(클래스 선언)
2. 객체가 가지고 있어야할 속성(필드) 정의
3. 객체를 생성하는 방식을 정의(생성자)
    constructor
4. 객체가 가지고 있어야할 행위(메서드) 정의

*/


public class Car {

    String company; // 자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    public void horn() {
        System.out.println("빵빵");
    }

}
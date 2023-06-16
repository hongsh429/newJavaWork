package week03;

public class SportsCar extends Car{
    String engine;

    String model ; // 자동차 모델
    String color ; // 자동차 색상
    double price ; // 자동차 가격

    public SportsCar(String engine) {
        /* 여긴 아무것도 쓰여질 수 없다.*/
        this(engine, "Ferrari", "Red", 300000000);
        /* 이것이 this()의 개념.  생성자 overloading의 개념이 강하다 */
    }

    public SportsCar(String engine, String model, String color, double price) {
        this.engine = engine;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void booster() {
        System.out.println("엔진 " + engine + " 부앙~\n");
    }

    public void setCarInfo(String model, String color, double price) {
        super.model = model; // model은 부모 필드에 set
        super.color = color; // color는 부모 필드에 set
        this.price = price; // price는 자식 필드에 set
    }

    @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카에 브레이크란 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }
}

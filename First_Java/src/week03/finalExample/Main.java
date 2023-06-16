package week03.finalExample;

public class Main {
    public static void main(String[] args) {

        double result = 3.3 % 2;
        System.out.println("result = " + result);
        // LG TV 구현체를 조작
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();
        mrc.volumeUp();
        mrc.channelDown();
        mrc.channelUp();
        mrc.turnOnOff();


        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        MultiRemoteController mrc2 = new SamsungTv("Samsung");
        mrc2.turnOnOff();
        mrc2.channelUp();
        mrc2.volumeDown();
        mrc2.volumeUp();
        mrc2.turnOnOff();

        ((Tv) mrc).displayChannel(3);

    }
}

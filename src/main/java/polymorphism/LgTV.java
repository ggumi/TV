package polymorphism;

public class LgTV implements TV{ // 인터페이스 이용-> 모든 TV 클래스가 같은 메소드 갖도록 강제
    public void powerOn() {
        System.out.println("LgTV---전원 켠다.");
    }

    public void powerOff() {
        System.out.println("LgTV---전원 끈다.");
    }

    public void volumeUp() {
        System.out.println("LgTV---소리 올린다.");
    }

    public void volumeDown() {
        System.out.println("LgTV---소리 내린다.");
    }
}

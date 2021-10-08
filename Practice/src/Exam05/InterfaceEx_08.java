package Exam05;

interface PhoneInterface_08 {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("** Phone **");
    }
}

class SamsungPhone_08 implements PhoneInterface_08 {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class InterfaceEx_08 {
    public static void main(String[] args) {
        SamsungPhone_08 phone = new SamsungPhone_08();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}

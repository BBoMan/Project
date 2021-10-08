package Exam05;

class Weapon_06 {
    protected int fire() {
        return 1;   // 한 명 공격
    }
}

class Cannon_06 extends Weapon_06 {
    @Override
    protected int fire() {
        return 10;  //10명 공격
    }
}

public class Overriding_06 {
    public static void main(String[] args) {
        Weapon_06 weapon;
        weapon = new Weapon_06();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
        weapon = new Cannon_06();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}

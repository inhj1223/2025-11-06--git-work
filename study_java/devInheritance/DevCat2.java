package study_java.devInheritance;

public class DevCat2 {
    public static void main(String[] args) {
        //상속을 사용한 경우, 중복코드가 적거나 없다.

        System.out.println("== 흰 고양이 ==");
        WhiteCat2 a = new WhiteCat2();
        a.breath();
        a.meow();
        a.life();

        System.out.println("== 검은 고양이 ==");
        BlackCat2 b = new BlackCat2();
        b.breath();
        b.meow();
        b.wisdom();

        System.out.println("== 붉은 고양이 ==");
        RedCat2 c = new RedCat2();
        c.breath();
        c.meow();
        c.fastRun();


    }
}
class Cat{
    void breath(){
        System.out.println("숨쉬다");
    }

    void meow(){
        System.out.println("야옹");
    }

    void jump(){
        System.out.println("뛰어넘다");
    }

}

class BlackCat2 extends Cat{
    void wisdom(){
        System.out.println("미래를 예지하다");
    }
}

class WhiteCat2 extends Cat{
    void life(){
        System.out.println("목숨을 늘리다.");
    }

}

class RedCat2 extends Cat{
    void fastRun(){
        System.out.println("빠르게 이동");
    }

}

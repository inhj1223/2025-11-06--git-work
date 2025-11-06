package study_java.devInheritance;

public class DevCat {
    public static void main(String[] args) {


        //상속을 안쓴경우, 중복코드가 생긴다.

        System.out.println("== 흰 고양이 ==");
        WhiteCat a = new WhiteCat();
        a.breath();
        a.meow();
        a.life();

        System.out.println("== 검은 고양이 ==");
        BlackCat b = new BlackCat();
        b.breath();
        b.meow();
        b.wisdom();

        System.out.println("== 붉은 고양이 ==");
        RedCat c = new RedCat();
        c.breath();
        c.meow();
        c.fastRun();


    }
}

class BlackCat{
    void breath(){
        System.out.println("숨쉬다");
    }

    void meow(){
        System.out.println("야옹");
    }

    void jump(){
        System.out.println("뛰어넘다");
    }

    void wisdom(){
        System.out.println("미래를 예지하다");
    }
}

class WhiteCat{
    void breath(){
        System.out.println("숨쉬다");
    }

    void meow(){
        System.out.println("야옹");
    }

    void jump(){
        System.out.println("뛰어넘다");
    }

    void life(){
        System.out.println("목숨을 늘리다.");
    }

}

class RedCat{
    void breath(){
        System.out.println("숨쉬다");
    }

    void meow(){
        System.out.println("야옹");
    }

    void jump(){
        System.out.println("뛰어넘다");
    }

    void fastRun(){
        System.out.println("빠르게 이동");
    }

}

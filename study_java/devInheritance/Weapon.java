package study_java.devInheritance;

public class Weapon {
    public static void main(String[] args) {
        //자바에게 칼은 무기의 일종이다 라고 알려주는 것. 무기 is(extends) 칼
        // 상속을 통한 캐스팅, 형변환
        무기 a무기 = new 칼();
    }
}
class 무기 { }
class 칼 extends 무기 { } // 칼 == 무기이다라고 선언을 해준 것

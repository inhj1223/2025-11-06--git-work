package study_java.devstatic;

public class DevStatic2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();

        System.out.println(p1.age);
        p1.introduce();
        Person1.averPersonages();
    }

}
class Person1{
    int age;
    static int aver; // 각각의 객체가 가질 필요없는 변수는 static 을 붙여서
    // `Person.인류평균나이` 와 같은 방식으로 접근하는게 좋다.

    void introduce(){
        System.out.println("제 나이는"+ this.age + "살 입니다.");
    }
    static void averPersonages(){
        System.out.println("인류평균나이는" + aver + "살 입니다."); // 각각의 객체가 가질 필요없는
        // 메서드는 static 을 붙여서 `Person.인류평균나이소개();` 와 같은 방식으로 사용하는게 좋다.
    }

}



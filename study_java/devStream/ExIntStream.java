package study_java.devStream;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class ExIntStream {
    public static void main(String[] args) {
        System.out.println("== 비 스트림 ==");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("== 스트림 V1(no lamda) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        new IntConsumer() {
                            @Override
                            public void accept(int value) {
                                System.out.println(value);
                            }
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V2(use lamda) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        (int value) -> {                    //람다란?
                            System.out.println(value);      //함수형 프로그래밍을 지원하기 위해 Java 8부터 도입되었습니다
                        }                                   //코드를 더 간결하고 읽기 쉽게 만들어줍니다
                );                                          //주로 스트림 API와 함께 사용됩니다
        System.out.println();                               //기존의 익명 클래스 구현을 대체할 수 있습니다


        System.out.println("== 스트림 V3(매개변수 타입 생략) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        (value) -> {
                            System.out.println(value);
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V4(매개변수 괄호 생략) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(
                        value -> {
                            System.out.println(value);
                        }
                );
        System.out.println();

        System.out.println("== 스트림 V5(메서드 바디 중괄호 생략) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(value -> System.out.println(value));
        System.out.println();

        System.out.println("== 스트림 V6(최종축약형) ==");
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }
}

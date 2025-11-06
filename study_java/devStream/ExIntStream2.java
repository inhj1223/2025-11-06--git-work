package study_java.devStream;

import java.util.stream.IntStream;

public class ExIntStream2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i%2 ==0)continue;
            System.out.println(i);
        }

        IntStream.rangeClosed(1,10)
                .filter(e -> e%2 != 0) //필터를 통해 짝수를 걸러냄
                .forEach(System.out::println);
    }
}

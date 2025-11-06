public class test {
    public static void main(String[] args) {

        solution(2,10);



    }
    static int solution(int n, int t) {
        int a = 0;
        int answer=0;
        for(int i = 0; i <= t; i++){
            a += n * 2;
            answer = a;
            System.out.println(answer);

        }

        return answer;

    }


}

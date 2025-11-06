import java.util.Scanner;

public class Content1 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("== 명언 앱 ==");
        Scanner cm = new Scanner(System.in);
        while (true) {
            System.out.print("명령) ");
            String command = cm.nextLine();
            if (command.equals("종료")){
                break;
            }

        }
    }
}

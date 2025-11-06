import java.util.Scanner;

public class Content3 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("== 명언 앱 ==");
        Scanner cm = new Scanner(System.in);
        Scanner cn = new Scanner(System.in);
        Scanner at = new Scanner(System.in);
        while (true) {

            System.out.print("명령) ");
            String command = cm.nextLine();
            if (command.equals("등록")){
                System.out.print("명언 : ");
                String content = cn.nextLine();
                System.out.print("작가 : ");
                String auther = at.nextLine();
                num++;
                System.out.println(num+"번 명언이 등록되었습니다.");
            }

            else if (command.equals("종료")){
                break;
            }

        }
    }
}

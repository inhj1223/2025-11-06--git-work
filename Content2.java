import java.util.Scanner;

public class Content2 {
    public static void main(String[] args) {
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
            }

            else if (command.equals("종료")){
                break;
            }

        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Content6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int id = 0;
        System.out.println("== 명언 앱 ==");
        Scanner cm = new Scanner(System.in);
        Scanner cn = new Scanner(System.in);
        Scanner at = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        while (true) {

            System.out.print("명령) ");
            String command = cm.nextLine();
            if (command.equals("등록")) {
                System.out.print("명언 : ");
                String content = cn.nextLine();
                System.out.print("작가 : ");
                String auther = at.nextLine();
                id++;
                String quote = id + " / " + auther + " / " + content;
                list.add(quote);
                System.out.println(id + "번 명언이 등록되었습니다.");
            }  if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));

                }
            }
            if (command.equals("삭제")) {
                    System.out.print("삭제?id=");
                    int delId = Integer.parseInt(num.nextLine());
                    list.remove(delId-1);

            }
            if (command.equals("종료")) {
                    break;
            }


            }
        }
    }


import javax.swing.*;
import java.io.*;
import java.util.*;

public class Content9 {
    private static final String DB_PATH = "src/db/wiseSaying";
    public static void main(String[] args) {

        int id = loadLastId();
        System.out.println("== 명언 앱 ==");
        Scanner cm = new Scanner(System.in);
        Scanner cn = new Scanner(System.in);
        Scanner at = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        File dir = new File(DB_PATH);


        while (true) {

            System.out.print("명령) ");
            String command = cm.nextLine();
            if (command.equals("등록")) {
                System.out.print("명언 : ");
                String content = cn.nextLine();
                System.out.print("작가 : ");
                String auther = at.nextLine();
                id++;
                System.out.println(id + "번 명언이 등록되었습니다.");
                saveLastId(id);
                saveWiseSaying(id, auther, content);
            }
            if (command.equals("수정")) {
                Map<String, String> data = loadWiseSaying(id);
                System.out.print("수정?id=");
                int uid = Integer.parseInt(num.nextLine());
                System.out.println("명언(기존) : " + data.get("content"));
                System.out.print("명언 : ");
                String content = cn.nextLine();
                System.out.println("작가(기존) : " + data.get("auther"));
                System.out.print("작가 : ");
                String auther = at.nextLine();
                saveWiseSaying(id, auther, content);
                System.out.println(uid + "번 명언이 수정되었습니다.");


            }
            if (command.equals("목록")) {
                File[] files = dir.listFiles((d, name) -> name.endsWith(".json"));
                if (files == null || files.length == 0) {
                    System.out.println("등록된 명언이 없습니다.");
                    continue;
                }

                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                Arrays.sort(files, Comparator.comparing(File::getName).reversed());

                for (File f : files) {
                    int lid = Integer.parseInt(f.getName().replace(".json", ""));
                    Map<String, String> data = loadWiseSaying(lid);
                    System.out.println(lid + " / " + data.get("auther") + " / " + data.get("content"));
                }
            }
            if (command.equals("삭제")) {
                System.out.print("삭제?id=");
                int delid = Integer.parseInt(num.nextLine());

                File file = new File(DB_PATH + "/" + delid + ".json");

                if (file.exists()) {
                    file.delete();
                    System.out.println(delid + "번 명언이 삭제되었습니다.");
                } else {
                    System.out.println(delid + "번 명언은 존재하지 않습니다.");
                }
            }
            if (command.equals("종료")) {
                break;
            }


        }
    }

    private static void saveWiseSaying(int id, String auther, String content) {
        try (FileWriter fw = new FileWriter(DB_PATH+"/"+id + ".json")) {
            fw.write("{\n");
            fw.write("  \"id\": " + id + ",\n");
            fw.write("  \"auther\": \"" + auther + "\",\n");
            fw.write("  \"content\": \"" + content + "\"\n");
            fw.write("}");
        } catch (IOException e) {
            System.out.println("파일 저장 오류: " + e.getMessage());
        }
    }

    private static Map<String, String> loadWiseSaying(int id) {
        Map<String, String> data = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(DB_PATH + "/" + id + ".json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("\"auther\""))
                    data.put("auther", line.split(":")[1].trim().replace("\"", "").replace(",", ""));
                else if (line.contains("\"content\""))
                    data.put("content", line.split(":")[1].trim().replace("\"", "").replace("}", ""));
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 오류:" + e.getMessage());
        }
        return data;
    }

    private static int loadLastId() {
        File file = new File(DB_PATH + "/lastId.txt");
        if (!file.exists()) return 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {
            return 0;
        }
    }
    private static void saveLastId(int id) {
        try (FileWriter fw = new FileWriter(DB_PATH + "/lastId.txt")) {
            fw.write(String.valueOf(id));
        } catch (IOException e) {
            System.out.println("lastId 저장 오류: " + e.getMessage());
        }
    }

}
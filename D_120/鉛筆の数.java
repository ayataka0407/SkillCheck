import java.util.*;
public class 鉛筆の数 {
    public static void main(String[] args) {
        try (// 自分の得意な言語で
                // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            System.out.println(12 * Integer.parseInt(line));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
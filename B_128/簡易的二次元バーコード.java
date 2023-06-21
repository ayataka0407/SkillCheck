package B_128;

import java.util.*;

public class 簡易的二次元バーコード {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[][] QR = new String[N.length()][9];

        // 入力値をまず３文字ずつ分割
        String[] target_3 = new String[N.length() / 3];
        for (int i = 0; i < N.length() / 3; i++) {
            target_3[i] = N.substring(3 * i, 3 * i + 3);
        }

        // 分割した3文字を1文字ずつ処理
        for (String target : target_3) {
            // それぞれの桁を一時変数にセット
            int a = Integer.parseInt(target.substring(0, 1));
            int b = Integer.parseInt(target.substring(1, 2));
            int c = Integer.parseInt(target.substring(2, 3));

            // QRコードを生成。デクリメントして0以上なら'#'をセット。以外なら'.'をセット。
            for (int i = 0; i < target.length(); i++) {
                for (int j = 0; j <= 2; j++) {
                    a -= 1;
                    if (a >= 0) {
                        QR[i][j] = "#";
                    } else {
                        QR[i][j] = ".";
                    }
                    b -= 1;
                    if (b >= 0) {
                        QR[i][j + 3] = "#";
                    } else {
                        QR[i][j + 3] = ".";
                    }
                    c -= 1;
                    if (c >= 0) {
                        QR[i][j + 6] = "#";
                    } else {
                        QR[i][j + 6] = ".";
                    }
                }
                for (String qrstString : QR[i]) {
                    System.out.print(qrstString);
                }
                System.out.println("");
            }
        }
    }
}

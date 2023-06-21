package B_131;

import java.util.*;

public class 運賃計算 {
    public static void main(String[] args) {
        try (
            // ユーザ入力待ち
        Scanner sc = new Scanner(System.in)) {
            // 1行目の入力。N,Mをそれぞれ運賃表の縦軸（Y軸）と横軸（X軸）を示す変数にセット
            int table_y_max = sc.nextInt();
            int table_x_max = sc.nextInt();

            // 2行目以降の運賃設定を運賃表にセット
            int[][] table = new int[table_y_max][table_x_max];
            for (int i = 0; i < table_y_max; i++) {
                for (int j = 0; j < table_x_max; j++) {
                    table[i][j] = sc.nextInt();
                }
            }

            // 1+N+1行目。ゴールまでの経由駅数をセット
            int X = sc.nextInt();

            // 2+N+i行目以降。経由すべき駅の座標から運賃を計算
            int ans = 0;
            // ひとつ前の駅の座標
            int pre_x = 0;
            int pre_y = 0;
            // 現在の駅の座標
            int cur_x = 0;
            int cur_y = 0;
            for (int i = 1; i <= X; i++) {
                // 経由すべき駅の座標を読み込み
                cur_y = sc.nextInt() - 1;
                cur_x = sc.nextInt() - 1;

                // 路線（Y軸）が変更されている場合、変更後の路線にずらす
                if (pre_y != cur_y) {
                    pre_y = cur_y;
                }

                // 前の駅との差額を加算
                ans += Math.abs(table[cur_y][cur_x] - table[pre_y][pre_x]);

                pre_y = cur_y;
                pre_x = cur_x;
            }
            System.out.println(ans);
        }
    }
}

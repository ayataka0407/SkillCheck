package C_084;

import java.util.*;
public class 枠で囲む {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<=line.length()+1;i++){
                sb.append("+");
            }
            System.out.println(sb.toString());
            System.out.println("+" + line + "+");
            System.out.println(sb.toString());
        }
    }
}
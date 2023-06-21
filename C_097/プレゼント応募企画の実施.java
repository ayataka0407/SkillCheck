package C_097;
import java.util.*;

public class プレゼント応募企画の実施 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int multipul_a = sc.nextInt();
        int multipul_b = sc.nextInt();
        sc.close();
        for(int i=1;i<=max;i++){
            if (i %multipul_a == 0 && i%multipul_b == 0){
                System.out.println("AB");
            }else if(i%multipul_a == 0){
                System.out.println("A");
            }else if(i%multipul_b == 0){
                System.out.println("B");
            }else{
                System.out.println("N");
            }
        }
    }
}


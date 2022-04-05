import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 120까지 소수 출력
        Scanner sc = new Scanner(System.in);
        int MAX = sc.nextInt();
        boolean[] Prime = new boolean[MAX + 1]; // 0부터 시작하니까
        Prime[0] = true;
        Prime[1] = true;  // 0과 1은 소수가 아님

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (!Prime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    Prime[j] = true;
                }
            }
        }
            for (int k = 1; k < MAX; k++) {
                if (Prime[k] == false) {
                    System.out.println(k + " ");
                }
            }

        }
    }

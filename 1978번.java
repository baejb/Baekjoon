import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1978번
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫번째 자연수

        int prime=0;
        for(int i = 1 ; i<=N ; i++){
            boolean isPrime = true;
            int num = sc.nextInt();
            if(num == 1){
                continue;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
                    if (isPrime) {
                        prime++;
                    }
        }
        System.out.println(prime);
        }
}



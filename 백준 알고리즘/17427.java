import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //17427번
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum =0 ; // int 로 쓰니까 틀렸다고 함 . 1000000까지 입력할 것을 고려해서 long 으로 
               for(int i = 1 ; i <=N ; i++){
                       sum+=(N/i)*i;
                }
            System.out.println(sum);
        }

}

// 원래 풀던대로 풀면 코드는 돌아가지만 시간초과가 뜬다. 따라서 시간을 줄일 수 있는 방법으로 sum+=(N/i)*i 를 통해 for문을 한번만 실행하게 했다. 

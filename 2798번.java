import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 2798번 블랙잭
        int N ; // N(3<=N<=100) 카드 수
        int M ; // M은 100000을 넘지 않는 양의 정수
        int[] arr; // 수를 담을 수 있는 배열
        int sum = 0; // 세 수를 더해서 저장하기 위함
        int max = 0; // 가장 합이 큰지 확인
        int num ; // 입력받은 수를 저장하기 위함
        int i=0; // i는 배열의 인덱스
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        M=scanner.nextInt();
        arr= new int[N];

        while(i<N){
            num = scanner.nextInt();
            arr[i]=num;
            i++;
        }
        for(i=0;i<N;i++){
            for(int k=i+1; k<N;k++){
                for(int j=k+1;j<N;j++){
                    sum=arr[i]+arr[k]+arr[j];
                    if(sum>max && sum<=M) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
        
    }
}

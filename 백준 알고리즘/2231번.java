import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //2231번 분해합
        int N ; // (1<=N<=1000000)인 자연수
        int result=0;
        int range;
        Scanner scanner= new Scanner(System.in);
        String str_N= scanner.nextLine(); // 자릿수의 길이를 알기 위함

        range= str_N.length(); // 각 자리수가 9 일때가 가장 최대
        N = Integer.parseInt(str_N);

        for (int i= (N-(range * 9)) ; i < N ; i++){
            int number=i; // 범위내에 포함되는 첫번째 수
            int sum =0 ; // 각 자릿수 합 변수

            while(number != 0){
                sum+= number%10 ; // 각 자릿수 더하기
                number/=10;
            }
            if(sum + i ==N){
                result =i ;
                break;
            }
        }
        System.out.println(result);
    }
}

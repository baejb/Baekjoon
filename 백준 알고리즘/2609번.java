import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //17427번
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 첫번째 자연수
        int M = sc.nextInt(); // 두번째 자연수
        int max=1;
        int min=1;

        if (N > M){
            for(int i =M ; i>0 ; i--){
                if(M%i ==0 && N % i == 0){
                    min=i * (M/i)*(N/i);
                    max=i;
                    break;
                }
            }
        }
        else{
            for(int j =N ; j>0 ; j--){
            if(M % j ==0 && N % j == 0){
                min=j * (M/j)*(N/j);
                max=j;
                break;
            }
        }
        }
        System.out.println(max);
        System.out.println(min);


    }
}


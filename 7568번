import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //7568번 덩치

        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt(); //전체 사람의 수

        int [][] arr = new int[num][3]; // 몸무게 ,키 ,랭크 저장위함

        for(int i=0 ; i<num ; i++){
            arr[i][0]=scanner.nextInt(); // 몸무게
            arr[i][1]=scanner.nextInt(); //키
        }

        for(int i= 0 ; i<arr.length ; i++){ // 모든 사람을 기준으로 
            int rank = 1;
            for(int j =0 ; j<arr.length; j++){ // 한사람씩 비교 
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){ //기준 사람보다 큰 사람이 있으면 rank 1 증가 
                    rank++;
                }
            }
            arr[i][2]=rank;
        }

        for(int i= 0 ;i<arr.length; i++){
            System.out.print(arr[i][2]+" ");
        }

    }
}

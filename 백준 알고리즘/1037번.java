import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //1037번 약수
        Scanner sc = new Scanner(System.in);
        int sum=1;

        int A = sc.nextInt(); //진짜 약수 갯수
        int [] arr= new int[A];

        for(int i= 0; i<A ; i++) {
            int N = sc.nextInt();//진짜 약수
            arr[i] = N;
            int min=arr[0];
            int max=arr[0];

            for (int j = 1; j < A; j++) {

                if (min > arr[j]) {
                    min = arr[j];
                }
                if (max < arr[j]) {
                    max = arr[j];
                }

                sum = min * max;
            }
        }
            System.out.println(sum);



}
}

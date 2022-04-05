import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); // 6부터 1000000까지
        boolean[] Prime = new boolean[100001]; // 0부터 시작하니까
        Prime[0] = true;
        Prime[1] = true;  // 0과 1은 소수가 아님
        int[] arr = new int[100001];
        int num = 0;
        int num1;
        int num2;
        while(true){
            int n = sc.nextInt();
            arr[num] = n;
            num++;
            if(n==0) break;

        }


        for (num = 0; num<arr.length ; num++) {
            for (int i = 2; i <= Math.sqrt(arr[num]); i++) {
                if (!Prime[i]) {

                    for (int j = i * i; j < arr[num]; j += i) {
                        Prime[j] = true;
                    }
                }
            }
            for (int k = 1; k < arr[num]; k++) {
                if (!Prime[k]) {
                    num1 = k;
                    if (!Prime[arr[num] - k]) {
                        num2 = arr[num] - k;
                        System.out.println(arr[num] + " = " + num1 + " + " + num2);
                        break;
                    }

                }

            }

        }
    }

        }




import java.util.*;

public class Main {
	
		
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			int count=s.nextInt(); // 입력한 수를 count에 저장 
			int arr[]= new int[count];
			for(int i=0;i<count;i++) {
				int num=s.nextInt(); // conut크기만큼 숫자를 배열에 저장 
				arr[i]=num;
			}
			Arrays.sort(arr); //오름차순으로 정렬
			for(int n:arr) {
				System.out.println(n);
				
			}
			s.close();
		}
}

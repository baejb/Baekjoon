package baekjoon;
/*정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고,
   아닐 경우 해당 수를 쓴다.정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다. */
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		int j=0;
		int sum=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<count;i++) {
			int num=s.nextInt();		
			if(num==0) {
				list.remove(j-1);
				j--;
			}
			else {
			list.add(num);
			j++;
			}
		
		}
		for(int k=0;k<list.size();k++) {
			sum+=list.get(k);
		}
		System.out.println(sum);
		

	}
}

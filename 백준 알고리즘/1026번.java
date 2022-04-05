import java.util.*;



public class Main {
	
		
		public static void main(String[] args) {
			int sum=0;
			int mul=0;
			int min;
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			int A[] =new int[num];
			int B[] =new int[num];
			for(int j=0;j<A.length;j++) {
				A[j]=s.nextInt();
			}
			for(int k=0;k<B.length;k++) {
				B[k]=s.nextInt();
			}
			Integer temp[]=new Integer[num];
			for(int j=0;j<temp.length;j++) {
				temp[j]=B[j];
			}
			
			Arrays.sort(A);
			Arrays.sort(temp,Collections.reverseOrder());
			
			for(int i=0;i<num;i++) {
				sum+=A[i]*temp[i];
							
			}
			System.out.println(sum);
			
			

}
}

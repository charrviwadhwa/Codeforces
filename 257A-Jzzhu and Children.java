
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_450A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int m=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<=m) {
				arr[i]=0;
			}
			else {
				arr[i]=(arr[i]+(m-1))/m;
			}
		}
		int max=Integer.MIN_VALUE;
		int ind=-1;
		for(int i=0;i<n;i++) {
			if(max<=arr[i]) {
				max=arr[i];
				ind=i;
			}
		}
		System.out.println(ind+1);
		
	}

}

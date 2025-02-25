
import java.util.Scanner;

public class Problem_144A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int min_in=0;
		int max_in=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
				max_in=i;
			}
			if(arr[i]<=min) {
				min=arr[i];
				min_in=i;
			}
		}
		int c=max_in+(n-1-min_in);
		if (max_in > min_in) {
            c--;
        }

		
		
			System.out.print(c);
		

	}

}

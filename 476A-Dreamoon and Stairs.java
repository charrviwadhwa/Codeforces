

import java.util.Scanner;

public class Problem_476A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int min=(n+1)/2;
		int ans=(min+m-1)/m*m;
		if(ans<=n) {
			System.out.println(ans);
		}
		else {
			System.out.println(-1);
		}

	}

}

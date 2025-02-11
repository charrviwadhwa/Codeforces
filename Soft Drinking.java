

import java.util.Scanner;

public class Problem_151A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int l=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int p=sc.nextInt();
		int nl=sc.nextInt();
		int np=sc.nextInt();
		
		int total_drinks=k*l;
		int each_friend_toast=total_drinks/nl;
		int lime_slice=c*d;
		int max_toasts=p/np;
		
		int ans=Math.min(Math.min(each_friend_toast, max_toasts),lime_slice)/n;
		System.out.println(ans);

	}

}

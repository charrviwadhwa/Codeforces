

import java.util.Scanner;

public class Problem_1237A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int flip=1;
		for(int i=0;i<n;i++) {
			int c=sc.nextInt();
			int a=0;
			if(c%2==0) {
				a=c/2;
			}
			else {
				  a = (c + flip)/2;
	                flip *= -1;  
			}
			System.out.println(a);
		}
		

	}

}


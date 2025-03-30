

import java.util.Scanner;

public class problem_2091A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			StringBuilder sb=new StringBuilder("01032025");
			
			int c=0;
			for(int i=0;i<n;i++) {
				int ind=sb.indexOf(String.valueOf(arr[i]));
				if(ind!=-1) {
					sb.deleteCharAt(ind);
				}
				c++;
				if (sb.isEmpty()) {
					break;
				}
			}
			if(!sb.isEmpty()) {
				System.out.println(0);
			}
			
			else System.out.println(c);
			t--;
		}

	}

}

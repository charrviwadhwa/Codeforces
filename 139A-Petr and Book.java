

import java.util.Scanner;

public class Problem_139A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int pages=sc.nextInt();
		int c=0;
		int[]arr=new int[7];
		for(int i=0;i<7;i++) {
			arr[i]=sc.nextInt();
		}
		while(pages>0) {
			pages-=arr[c];
			c++;
			c=c%7;
		}
		
		if(c==0) {
			System.out.println(7);
		}
		else {
			System.out.println(c);
		}

	}

}

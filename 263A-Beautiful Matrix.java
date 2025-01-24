

import java.util.Scanner;

public class Problem_263A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr=new int[5][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int r=0;
		int c=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]==1) {
					r=i+1;
					c=j+1;
					break;
				}
			}
		}
		int op=Math.abs(r-3)+Math.abs(c-3);
		System.out.println(op);
	}

}

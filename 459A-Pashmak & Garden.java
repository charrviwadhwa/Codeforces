

import java.util.Scanner;

public class Problem_459A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		if(x1!=x2 && y1!=y2 && Math.abs(x1-x2)!=Math.abs(y2-y1)) {
			System.out.println(-1);
			return;
		}
		else if(x1==x2) {
			System.out.println((x1+Math.abs(y2-y1))+" "+y1+" "+(x2+Math.abs(y2-y1))+" "+y2);
		}
		else if(y1==y2) {
			System.out.println(x1+" "+(y1+Math.abs(x2-x1))+" "+x2+" "+(y2+Math.abs(x2-x1)));
		}
		else {
			System.out.println(x1+" "+y2+" "+x2+" "+y1);
		}

	}

}

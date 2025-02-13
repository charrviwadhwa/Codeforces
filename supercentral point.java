 
import java.util.Scanner;

public class problem_165A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]x=new int[n];
		int[]y=new int[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		int point=0;
		for(int i=0;i<n;i++) {
			int l=0,r=0,t=0,b=0;
			for(int j=0;j<n;j++) {
				if(x[j]>x[i] && y[i]==y[j]) {
					r=1;
				}
				if(x[j]<x[i] && y[i]==y[j]) {
					l=1;
				}
				if(x[i]==x[j] && y[i]<y[j]) {
					b=1;
				}
				if(x[i]==x[j] && y[i]>y[j]) {
					t=1;
				}
			}
			if(l==1 && r==1 && t==1 && b==1) {
				point++;
			}
		}
		System.out.println(point);

	}

}
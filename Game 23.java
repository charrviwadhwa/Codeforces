import java.util.Scanner;

public class Problem_1141A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=0;
		if(m%n!=0) {
			System.out.println(-1);
			return;
		}
		int r=m/n;
		while(r%2==0) {
			r/=2;
			c++;
		}
		while(r%3==0) {
			r/=3;
			c++;
		}
		if(r!=1) {
			System.out.println(-1);
		}
		else {
			System.out.println(c);
		}
		

	}

}

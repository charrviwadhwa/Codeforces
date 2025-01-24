import java.util.Scanner;

public class Problem_69A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int x=0;
		int y=0;
		int z=0;
		for(int i=0;i<n;i++) {
			int j=sc.nextInt();
			int k=sc.nextInt();
			int m=sc.nextInt();
			x+=j;
			y+=k;
			z+=m;
			
		}
		if(x==0 && y==0 && z==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	
	}

}

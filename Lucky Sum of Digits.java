import java.util.Scanner;

public class Problem_109A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s="";
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(4*i+7*j==n) {
					s+="4".repeat(i)+"7".repeat(j);
					System.out.println(s);
					return;
				}
			}
		}
			System.out.println("-1");
		
		

	}

}

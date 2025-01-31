import java.util.Scanner;

public class Problem_266A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int c=0;
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1))
			{
				c++;
			}
		}
		System.out.println(c);
	}

}

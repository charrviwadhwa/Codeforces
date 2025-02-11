

import java.util.Scanner;

public class Problem_514A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder result = new StringBuilder();		
		for(int i=0;i<str.length();i++) {
			int a=str.charAt(i)-'0';
			if(i==0 && a==9) {
				result.append(a);
			}
			else if(a>=5) {
				result.append(9-a);
			}
			else {
				result.append(a);
			}
		}
		System.out.println(result.toString());
	}

}

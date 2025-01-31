import java.util.Scanner;

public class Problem_59A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a') {
				lower++;
			}
			else {
				upper++;
			}
		}
		if(lower>=upper) {
			System.out.println(s.toLowerCase());
		}
		else {
			System.out.println(s.toUpperCase());
		}
		

	}

}

package CodeForces;

import java.util.Scanner;

public class Problem_271A {
	public static boolean check(String year) {
		   for (int i = 0; i < year.length(); i++) {
		       for (int j = i + 1; j < year.length(); j++) {
		           if (year.charAt(i) == year.charAt(j)) {
		               return false;
		           }
		       }
		   }
		   return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		while (true) {
		       n++;
		       String year = String.valueOf(n);
		       if (check(year)) {
		          ans=n;
		          break;
		       }
		   }
		System.out.println(ans);

	}

}

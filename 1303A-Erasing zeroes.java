


import java.util.Scanner;

public class Problem_1303A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();  
	      

	        while (t-- > 0) {
	            String s = sc.next();
	            int firstOne = -1, lastOne = -1, zero = 0;

	            for (int i = 0; i < s.length(); i++) {
	                if (s.charAt(i) == '1') {
	                    if (firstOne == -1) firstOne = i;
	                    lastOne = i;
	                }
	            }

	           
	            if (firstOne == -1) {
	            	System.out.println("0");
	            	continue;
	            }

	            
	            for (int i = firstOne; i <= lastOne; i++) {
	                if (s.charAt(i) == '0') zero++;
	            }

	            System.out.println(zero);
	        }

	}

}

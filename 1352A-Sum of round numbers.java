
import java.util.ArrayList;

import java.util.Scanner;

public class Problem_1352A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while (t-- > 0) {
        	 int n = sc.nextInt();
        	 ArrayList<Integer> roundNumbers = new ArrayList<>();
             int power = 1;  
             
             while (n > 0) {
                 int digit = n % 10;
                 if (digit != 0) {
                     roundNumbers.add(digit * power);
                 }
                 n /= 10;
                 power *= 10;
             }

          
             System.out.println(roundNumbers.size());
             for (int num : roundNumbers) {
                 System.out.print(num + " ");
             }
             System.out.println();
        }
		

	}

}

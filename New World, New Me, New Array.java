

import java.util.Scanner;

public class problem_2072A {
    public static int minOperations(int n, int k, int p) {
        if (k < -n * p || k > n * p) {
            return -1;
        }

        int absK = Math.abs(k);

        int ops = absK / p; 
        int remainder = absK % p;  

        if (remainder > 0) {
            ops += 1;
        }

        return ops;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            System.out.println(minOperations(n, k, p));
        }

    }
}

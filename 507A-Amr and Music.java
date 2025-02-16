package CodeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem_507A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[][]arr=new int[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=i+1;
		}
		int sum=0;
		
		Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
		ArrayList<Integer>l=new ArrayList();
		
		for(int i=0;i<n;i++) {
			
			if(sum+arr[i][0]<=k) {
				sum+=arr[i][0];
				l.add(arr[i][1]);
				
			}
			else {
				break;
			}
		}
		System.out.println(l.size());
		Collections.sort(l);
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}

	}

}

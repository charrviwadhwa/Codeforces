

import java.util.ArrayList;
import java.util.Scanner;

public class problem_381A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int s1=0;
		int s2=0;
		int i=0;
		int j=arr.length-1;
		boolean sturn=true;
		while(i<=j) {
			if(sturn) {
				if(arr[i]>arr[j]) {
				s1+=arr[i];
				i++;
			}
			else {
				s1+=arr[j];
				j--;
			}
				sturn=false;
			}
			else {
			if(arr[i]>arr[j]) {
				s2+=arr[i];
				i++;
			}
			else {
				s2+=arr[j];
				j--;
			}
			sturn=true;
			}
		}
		System.out.println(s1+" "+s2);
		
		
	}

}

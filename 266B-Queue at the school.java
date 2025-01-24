import java.util.Scanner;
 
public class Problem_266B {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String str=sc.next();
		char [] arr=str.toCharArray();
		
		
		while(k>0) {
			for(int i=0;i<n-1;i++) {
				if(arr[i]=='B' && arr[i+1]=='G') {
					char temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					i++;
				}
			}
			k--;
		}
		String str1= new String(arr);
		System.out.print(str1);
	}
 

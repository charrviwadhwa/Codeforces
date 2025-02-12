import java.util.Scanner;

public class A_packing_rectangles {
	public static boolean is_possible(long w,long h,long n,long mid) {
		long r=mid/h;
		long c=mid/w;
		
		return c>=0 && r>=(n+(c-1))/c; //important
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long w=sc.nextLong();
		long h=sc.nextLong();
		long n=sc.nextLong();
		long low=Math.max(h, w);
		long high=Math.max(h, w)*n;
		long ans=0;
		while(low<=high) {
			long mid=low+(high-low)/2;
			//can i pack rectangles in m*m square 
			if(is_possible(w,h,n,mid)) {
				ans=mid;
				high=mid-1;	
			}
			else {
				low=mid+1;
			}
			
		}
		System.out.println(ans);

	}

}


import java.util.Scanner;

public class Problem_121A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long l=sc.nextLong();
		long r=sc.nextLong();
		
		long x=4;
		long prev=0; // previous lucky number
		long ans=0;
		long fl=-1;
		while(x<=r) {
			if(x>=l) {
				if(prev<l) {
					ans+=(x-l+1)*x;
				}
				else {
					ans+=(x-prev)*x;
				}
			}
			prev=x;
			long y=0;
			int c=0;
			boolean found=false;
			while(x>0) {
				if(!found) {
					if(x%10==7) {
						y+=Math.pow(10, c)*4;
					}
					else {
						y+=Math.pow(10, c)*7;
						found=true;
					}
				}
				else {
					y+=Math.pow(10, c)*(x%10);
				}
				x/=10;
				c++;
			}
			if(!found) {
				y+=Math.pow(10, c)*4;
			}
			
			x=y;
			
		}
		if(prev!=r) {
			if(l>prev) {
				ans+=(r-l+1)*x;
			}
			else {
				ans+=(r-prev)*x;
			}
		}
		System.out.println(ans);

	}

}

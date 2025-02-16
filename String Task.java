

import java.util.Scanner;

public class Problem_118A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner (System.in);
		String s=sc.next();
		s=s.toLowerCase();
		String str="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y') {
				continue;
			}
			else {
				str+=".";
				str+=ch;
			}
		}
		System.out.println(str);

	}

}

package fundamentals;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int n,r=0,t;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		t=n;
		while(n!=0) {
			r=r*10+n%10;
			n=n/10;
		}
		if(r==t)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
       }
}


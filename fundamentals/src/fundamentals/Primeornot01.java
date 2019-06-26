package fundamentals;
import java.util.Scanner;
public class Primeornot01 {
	public static void main(String[] args) {
		int c=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0||n==1)
			System.out.println(n+"is neither prime nor composite");
		else if(n>=2) {
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					c++;
			}
		if(c==2)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not a prime number");
	}
	}

}

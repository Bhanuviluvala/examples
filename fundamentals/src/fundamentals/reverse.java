package fundamentals;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		int n,r=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0) {
			r=r*10+n%10;
			n=n/10;
		}
		System.out.println(r);
	}
}

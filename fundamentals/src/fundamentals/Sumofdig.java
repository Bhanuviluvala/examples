package fundamentals;
import java.util.Scanner;
public class Sumofdig {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,sum=0,d;
		n=s.nextInt();
		while(n!=0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}

}

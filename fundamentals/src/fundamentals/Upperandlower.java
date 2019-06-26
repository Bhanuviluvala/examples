package fundamentals;

public class Upperandlower {
	
	public static void main(String[] args) {
		

		char c=args[0].charAt(0);
		
		if(c>=65&&c<=90)
			System.out.println(args[0]+"->"+args[0].toLowerCase());
		
		if(c>=97&&c<=122)
			System.out.println(args[0]+"->"+args[0].toUpperCase());
	}

}

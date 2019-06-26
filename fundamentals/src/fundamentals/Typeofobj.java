package fundamentals;

public class Typeofobj {
	public static void main(String[] args) {
		char s='d';
		if((s>='A' &&s<='Z')||s>='a'&&s<='z')
			System.out.println("Alphabet");
		else if(s>='0'&& s<='9')
			System.out.println("digit");
		else
			System.out.println("Special character");
	}

}

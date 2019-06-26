package Demo;

public class alpha {
	public static void main(String []args) {
		char s='1';
		if((s>='A' && s<='Z')||(s>='a' && s<='z'))
			System.out.println("Alphabets");
		else if(s>='0' && s<='9')
			System.out.println("Digit");
		else
			System.out.println("special character");
	}

}

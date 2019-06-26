package Demo;

public class Tenth 
{
	public static void main(String args[])
	{
		char ch='A';
		int n=(int) ch;
		if(n>=65&&n<=90)
		{
		n=n+32;
		char c=(char) n;
		System.out.println(ch+"->"+c);
		}
		else
		{
		n=n-32;
		char c=(char) n;
		System.out.println(ch+"->"+c);
		}
	}
}



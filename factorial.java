package class1;
import java.util.*;
public class fact 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a val");
		int a=s.nextInt();
		int b=1;
		while(a>0)
		{
			b=b*a;
			a--;
			
		}
		System.out.println(b);
	}
}

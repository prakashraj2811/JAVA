package class2;
import java.util.*;

public class adam
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a,sq1=0,sq2=0,r,n;
		System.out.println("enetr the n value");
		a=n=s.nextInt();
		
		a=n*n;
		System.out.println(a);
		while(a>0)
		{
			
			r=a%10;
			sq1=(sq1*10)+r;
			a=a/10;
			System.out.println(r);
		}
		while(n>0)
		{
			System.out.println(n);
			r=n%10;
			sq2=(sq2*10)+r;
			n=n/10;
			System.out.println(r);
		}
		sq2*=sq2;
		System.out.println(sq1);
		if(sq1==sq2)
		{
			System.out.println("it is a adam number"+n);
		}	
			else
			{
				System.out.println("it is not adam"+n);
			}
		
	}
}

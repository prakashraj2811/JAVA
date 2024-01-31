package class1;
import java.util.*;
public class Switch2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.nextLine();
		System.out.println("enter the age");
		int age=s.nextInt();
		System.out.println("enter the m1");
		int m1=s.nextInt();
		System.out.println("enter the m2");
		int m2=s.nextInt();
		System.out.println("enter the m3");
		int m3=s.nextInt();
		System.out.println("enter the m4");
		int m4=s.nextInt();
		System.out.println("enter the m5");
		int m5=s.nextInt();
		int tot=m1+m2+m3+m4+m5;
		System.out.println(tot);
		int avg=tot/5;
		System.out.println(avg);
		switch(avg)
		{
		case 90:{System.out.println("MBBS");
		  		break;}
		case 80:{
			     System.out.println("Bsc.cs");
			     break;}
		case 70 & 60:{System.out.println("B.com");
		       	break;}
		case 50:{System.out.println("BBA");
				break;}
		default:{System.out.println("default");}
		}
	}	
}
		

	


package awtconcept;
import java.util.*;
import javax.swing.*;
public class scann1
{
	public static void main(String args[])
	{
		JFrame frame=new JFrame("menu bar example");
		JMenuBar menuBar=new JMenuBar();
		
		//file menu
		JMenu fileMenu=new JMenu("file");
		
		JMenuItem nameItem =new JMenuItem("name");
		JMenuItem ageItem=new JMenuItem("age");
		JMenuItem placeItem=new JMenuItem("place");
		JMenuItem totItem=new JMenuItem("tot");
		JMenuItem avgItem=new JMenuItem("avg");
		
		
		
		fileMenu.add(nameItem);
		fileMenu.add(ageItem);	
		fileMenu.add(placeItem);
		fileMenu.add(totItem);
		fileMenu.add(avgItem);
		
		
		
		
		//add menus to menu bar
		menuBar.add(fileMenu);
		
		
		
		//add menu bar to frame
		frame.setJMenuBar(menuBar);
		
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name");
		String name = s.nextLine();
		System.out.println("enter the age");
		int age = s.nextInt();
		System.out.println("Enter the m1");
		int m1 = s.nextInt();
		System.out.println("Enter the m2");
		int m2 = s.nextInt();
		System.out.println("Enter the m3");
		int m3 = s.nextInt();
		System.out.println("Enter the m4");
		int m4 = s.nextInt();
		System.out.println("Enter the m5");
		int m5 = s.nextInt();
		System.out.println("Enter the place");
		String place = s.nextLine();
		s.nextLine();
		 int tot = m1+m2+m3+m4+m5;
			
			System.out.println(tot);
		
			int  avg = tot/5;
			System.out.println(avg);
		
		if(age>=18)
		{
			 
		
			System.out.println("its is the eligible");
			
		}
		else
		{
			System.out.println("its not eligible");
		}
		if(avg<=90)
		{
			System.out.println("your eligible to medical department");
			
		}
		else if(avg<=80)
		{
			System.out.println("your eligible to engineer department");
			
		}
		else if(avg<=70)
		{
			System.out.println("your eligible to science department");
			
		}
		else if(avg<=60)
		{
			System.out.println("your eligible to arts department");
			
		}
		else
		{
			System.out.println("your not eligible in the course");
		}
	}
}


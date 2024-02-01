package class1;

public class arr 
{
	public static void main(String args[])
	{
		char[] letters = {'a','b','c','d','e'};
		System.out.println("element ata index 0:" + letters[0]);
		System.out.println("element ata index 1:" + letters[1]);
		System.out.println("element ata index 2:" + letters[2]);
		System.out.println("element ata index 3:" + letters[3]);
		System.out.println("element ata index 4:" + letters[4]);
		System.out.println("iterating throught the array:");
		for(int i=0;i<letters.length;i++)
		{
			System.out.println("element at index"+i+":"+letters[i]);
		}
		
	}
}

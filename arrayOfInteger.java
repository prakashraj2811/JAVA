package class1;

public class array 
{
		public static void main(String args[])
		{
			int[] numbers = new int[5];
			System.out.println("element ata index 0:" + numbers[0]);
			System.out.println("element ata index 1:" + numbers[1]);
			System.out.println("element ata index 2:" + numbers[2]);
			System.out.println("element ata index 3:" + numbers[3]);
			System.out.println("element ata index 4:" + numbers[4]);
			System.out.println("iterating throught the array:");
			for(int i=0;i<numbers.length;i++)
			{
				System.out.println("element at index"+i+":"+numbers[i]);
			}
			
		}
	

}

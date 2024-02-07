package class2;

public class stringbuffer 
{
	public static void main(String args[])
	{
		StringBuffer stringBuffer=new StringBuffer();
		//appending string
		stringBuffer.append("hello");
		stringBuffer.append(" ");
		stringBuffer.append("world");
		
		//display the content sting
		System.out.println("stringBuffer content:" +stringBuffer);
		
		//inserting a string at specific position
		stringBuffer.insert(5,"java");
		
		//displaying modifier content
		System.out.println("modified StringBuffer content:"+stringBuffer);
		
		//replacing a substring
		stringBuffer.replace(6, 10,"universe");
		
		//display the replace content
		System.out.println("replaced StringBuffer content:"+stringBuffer);
		
		//deleting a substring
		stringBuffer.delete(6, 13);
		
		//display the delete content
		System.out.println("deleted stringBuffer content:"+stringBuffer);
		
		//appending on integer
		int number =123;
		stringBuffer.append(" ").append(number);
		
		
		//display the content after appending
		System.out.println("appended stringBuffer conten:"+stringBuffer);
		
		//converting stringBuffer to string
		String str=stringBuffer.toString();
		
		//display the converted string
		System.out.println("converted string:  " + str);
		
	}
}

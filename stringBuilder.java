package class2;

public class stringbuilder 
{
	public static void main(String args[])
	{
	
	StringBuilder stringBuilder=new StringBuilder();
	//appending string
	stringBuilder.append("hello");
	stringBuilder.append(" ");
	stringBuilder.append("world");
	
	//display the content sting
	System.out.println("StringBuilder content:" +stringBuilder);
	
	//inserting a string at specific position
	stringBuilder.insert(5,"java");
	
	//displaying modifier content
	System.out.println("modified StringBuilder content:"+stringBuilder);
	
	//replacing a substring
	stringBuilder.replace(6, 10,"universe");
	
	//display the replace content
	System.out.println("replaced StringBuilder content:"+stringBuilder);
	
	//deleting a substring
	stringBuilder.delete(6, 13);
	
	//display the delete content
	System.out.println("deleted StringBuilder content:"+stringBuilder);
	
	//appending on integer
	int number =123;
	stringBuilder.append(" ").append(number);
	
	
	//display the content after appending
	System.out.println("appended StringBuilder conten:"+stringBuilder);
	
	//converting stringBuffer to string
	String str=stringBuilder.toString();
	
	//display the converted string
	System.out.println("converted string:  " + str);
 }
}

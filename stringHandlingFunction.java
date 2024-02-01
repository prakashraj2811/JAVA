package class1;

public class stringhand 
{
	public static void main(String args[])
	{
		//creating strings
		String str1="hello";
		String str2=new String("world");
		
		//concatenating string
		String message1= str1 + ","+str2;
		String message2=str1.concat(",").concat(str2);
		
		//getting string length
		int length = str1.length();
		
		//Accessing characters
		char firstChar=str1.charAt(0);
		char lastChar=str1.charAt(str1.length()-1);
		
		//Extracting substring
		String substring=str1.substring(1,4);
		
		//converting case
		String upperCase=str1.toUpperCase();
		String lowerCase=str2.toLowerCase();
		
		//checking for substring
		boolean containsHello = message1.contains("hello");
		boolean endsWithWorld=message2.endsWith("world");
		
		//Replacing characters 
		String replacedString=str1.replace('i','z');
		
		//splitting strings
		String sentence="jav is fun";
		String[] words=sentence.split("a");
		
		//trimming whitespace
		String stringWithWhitespace = " hello ";
		String trimmedString =stringWithWhitespace.trim();
		
		//Comparing strings
		boolean isEqual=str1.equals(str2);
		boolean isEqualIgnoreCase=str1.equalsIgnoreCase("hello");
		
		//display results
		System.out.println("string 1:" +str1);
		System.out.println("string 2:"+str2);
		System.out.println("Concatenating message1:"+message1);
		System.out.println("concatenating message2:"+message2);
		System.out.println("length of string 1:"+length);
		System.out.println("First character of String 1:"+firstChar);
		System.out.println("last character of string 1:"+lastChar);
		System.out.println("substring of string 1:"+substring);
		System.out.println("string 1 is uppercase:"+upperCase);
		System.out.println("string 2 is lowercase:"+lowerCase);
		System.out.println("message 1 cantains 'hello':"+containsHello);
		System.out.println("message 2 ends with world:"+endsWithWorld);
		System.out.println("string 1 affter replacing :"+replacedString);
		System.out.println("words in sentence:"+String.join(",", words));
		System.out.println("Trimmed String:"+trimmedString+"");
		System.out.println("are str1 and str2 equal?"+isEqual);
		System.out.println("are str1 and hello equal ignoreing case?"+isEqualIgnoreCase);
		
	}
}

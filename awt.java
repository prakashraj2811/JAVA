package awtconcept;
import java.awt.*;
public class awt extends Frame
{
	
	public awt()
	{
		
	//set layout manager
	setLayout(new FlowLayout());
	
	//create label
	Label nameLabel=new Label("names:");
	
	//create textField
	TextField nameTextField=new TextField(20);
	
	//add components to file frame
	add(nameLabel);
	add(nameTextField);
	
	
	//set frame properties
	setTitle("textfield example");
	setSize(300,100);
	setVisible(true);	
	
	
	}
	public static void main(String args[])
	{
		new awt();
	}
}


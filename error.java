package awtconcept;
import java.awt.*;
import java.awt.event.*;
public class awt1 extends Frame implements ActionListener

{
	// components
	Label nameLabel,emailLabel,passwordLabel,confirmPasswordLabel;
	TextField nameField,emailField,passwordField,confirmPassword;
	Button submit;
	
	public awt1()
	{
		//frame setup
		setTitle("registration form");
		setSize(400,300);
		setLayout(null);
		
		//labels
		nameLabel = new Label("name:");
		nameLabel.setBounds(50,50,80,30);
		add(nameLabel);
		
		emailLabel = new Label("email:");
		emailLabel.setBounds(50,90,80,30);
		add(emailLabel);
		
	     passwordLabel = new Label("password:");
		passwordLabel.setBounds(50,170,80,30);
		add(passwordLabel);
		
		confirmPasswordLabel = new Label("confirmPasswordLabel:");
		confirmPasswordLabel.setBounds(50,50,80,30);
		add(confirmPasswordLabel);
		
		//text fields
		nameField=new TextField();
		nameField.setBounds(180,130,150,30);
		add(nameField);
		
		emailField=new TextField();
		emailField.setBounds(180,130,150,30);
		add(emailField);
		
		passwordField=new TextField();
		passwordField.setBounds(180,130,150,30);
		passwordField.setChar("*");
		add(passwordField);
		
		confirmPasswordField=new TextField();
		confirmPasswordField.setBounds(180,130,150,30);
		confirmPasswordField.setEchoChar("*");
		add(confirmPasswordField);
		
		//button
		submitButton = new Button("submit");
		submitButton.setBounds(150,220,100,30);
		submittButton.ActionListener(this);
		add(submitButton);
		
		
		//frame visibility
		setVisibility(true);
		
		
	}
	
	//Action performed when submit button clicked
	public void actionperformed(ActionListener e)
	{
		String name= nameField.getText();
		String email= emailField.getText();
		String password= passwordField.getText();
		String confirmPassword=confirmPasswordField.getText();
		
		
		//checked condition
		if(password.equals(confirmPassword))
		{
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			System.out.println("password:"+password);
			System.out.println("confirmPasssword:"+confirmpPassword);
			
		}
		else
		{
			System.out.println("its not match:");
		}
	}
	public static void main(String args[])
	{
		new awt1();
	}
}


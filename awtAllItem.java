package awtconcept;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class allitem
{
	Label nameLabel=new Label("form:");
 	TextField nameTextField=new TextField(20);
    private Frame frame;
	private Checkbox checkbox;
	private List list;
	
 public allitem()
	{
		frame = new Frame("Checkbox");
		checkbox = new Checkbox("show");
		
		
		checkbox.addItemListener(new ItemListener()
				{
			public void itemStateChanged(ItemEvent e)
			{
				if(checkbox.getState())
				{
					System.out.println("yeah this is checked");
					
				}
				else
				{
					System.out.println("yeah this is  not checked");
				}
			}

			
				});
		list.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==ItemEvent.SELECTED)
				{
					String select=list.getSelectedItem();
					System.out.println(select);
				}
			}
		});
		
		frame.add(checkbox,BorderLayout.NORTH);
		frame.setSize(200,200);
		frame.setVisible(true);
	
			frame = new Frame("list");
			list = new List();
			list.add("java");
			list.add("python");
			list.add("cpp");
			list.add("c");
			list.add("react");
			
			
			frame.add(list);
			frame.setSize(200,200);
			frame.setVisible(true);
			
		}
	public static void main(String args[])
	{
		new allitem();
	}
	}
 


/**
 * 
 */

/**
 * @author Christian G aka Darth Calculus
 *
 */
//lets use ignore case for this one.

import java.util.*;

import javax.swing.JOptionPane;
public class ISP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Package Type	
		//variables for package type and hours
		char packageType;
		int hours;
		final double packA = 9.95, packB = 13.95, packC = 19.95;
		double totalCost,hourlyCost,savingsCost;
		
		//String format for GUI
		String input = JOptionPane.showInputDialog(String.format("Hello,"
				+ " Please tell me the package type you subscribed?"));
		//convert it to a char, 0 means first letter
		packageType = input.charAt(0);
		
		//input.equalsIgnoreCase("PROSPERO"
		switch(packageType)
		
		{
		
		case 'A':
			 JOptionPane.showMessageDialog(null, "you have selected Package A!");
			 String input2 = JOptionPane.showInputDialog(String.format("How many"
						+ "hours did you used for access??"));
			 hours = Integer.parseInt(input2); 
			if(hours>=10)
			{
				
				hourlyCost = hours*2.00;
				totalCost = packA + hourlyCost;
						
				
				JOptionPane.showMessageDialog(null, "Since you have spent "+hours +" hours"
						+ "you were charged with $2.00 more per hour,");
			
				JOptionPane.showMessageDialog(null, "Hourly Cost: "+hourlyCost
						+". Your Total Cost is: "+totalCost);
				
			
				JOptionPane.showMessageDialog(null, "Did you know you can save"
						+ "money by switching to package C if you only spend a lot "
						+ "in the internet?" +"your total Bill could have"
								+ " been: "
						+packC);	
						
				
				
				
			}
			
			else
				JOptionPane.showMessageDialog(null, "Total Bill Cost:  " +packA);	
				
			 
			 break;
		case 'B':
			JOptionPane.showMessageDialog(null, "you have selected Package B!");
			String input3 = JOptionPane.showInputDialog(String.format("How many"
						+ "hours did you used for access??"));
			hours = Integer.parseInt(input3); 
				if(hours>=20)
				{
				hourlyCost = hours*1.00;
				totalCost = packB + hourlyCost;
	
				JOptionPane.showMessageDialog(null, "Since you have spent "+hours +" hours"
						+ "you were charged with $1.00 more per hour,");
			
				JOptionPane.showMessageDialog(null, "Hourly Cost: "+hourlyCost
						+". Your Total Cost is: "+totalCost);
				
					JOptionPane.showMessageDialog(null, "Did you know you can save"
							+ "money by switching to package C if you only spend a lot "
							+ "in the internet?" +"your total Bill could have"
									+ " been: "
							+packC);	
							
				
				
			}
			
			else
				JOptionPane.showMessageDialog(null, "Total Bill Cost:  " +packB);			
			
			
			break;
			
		case 'C':
			JOptionPane.showMessageDialog(null, "you have selected Package C!");
			String input4 = JOptionPane.showInputDialog(String.format("How many"
						+ "hours did you used for access??"));
			//converts string to hours
			hours = Integer.parseInt(input4); 
			JOptionPane.showMessageDialog(null, "Total Bill Cost:  " +packC);
			//savings cost
			
			if(hours<10)
				JOptionPane.showMessageDialog(null, "Did you know you can save"
						+ "money by switching to package A if you only spend less "
						+ "than 10 hours in the internet?" +"your total Bill could have"
								+ " been: "
						+packA);	
			
			else if(hours>10 && hours <20)
				JOptionPane.showMessageDialog(null, "Did you know you can save"
						+ "money by switching to package B if you only spend less "
						+ "than 10 hours in the internet?" +"your total Bill would be: "
						+packB);
			break;
			
		default: 
			JOptionPane.showMessageDialog(null, "Wrong Input! +"
					+ "Dont forget to type the capital letters for Package Type!");

		
			
			
			
			
			
			
		
		System.exit(0);
		
		}
				
		

	}

}

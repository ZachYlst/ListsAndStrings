package useful.view;

import javax.swing.JOptionPane;

/**
 * 
 * @author Zachary Ylst
 * @version 1.0 03.10.2017
 */

public class PopupDisplay
{
	public void displayText(String message)		//Displays message in a popup window
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String getResponse(String fromQuestion)		//Displays popup and returns answer as a String
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
	}
}

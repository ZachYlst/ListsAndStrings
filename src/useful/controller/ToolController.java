package useful.controller;

import java.util.List;		//Allows use of Lists
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController
{
	private List<Donut> donutList;		//Initializes a List (donutList) 
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();		//() calls constructor of ArrayList
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "glazed";
		for (int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();		//the same as lines 35-36 combined
			
		//	Donut currentDonut = donutList.get(index);
		//	String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.contentEquals(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best flavor ever!");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			display.displayText(donutList.get(index).toString());
			
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");		//Creates Donuts
		Donut glazed = new Donut("glazed");
		Donut chocolate = new Donut("chocolate");
		Donut oldFashioned = new Donut("old-fashioned");
		Donut rustyNail = new Donut("tetanus");
		
		donutList.add(jellyFilled);		//Adds Donuts to a list
		donutList.add(glazed);
		donutList.add(chocolate);
		donutList.add(oldFashioned);
		donutList.add(rustyNail);
	}
}

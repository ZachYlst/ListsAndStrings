package useful.controller;

import java.util.List;		//Allows use of Lists
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList;		//Initializes a List (donutList) 
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();		//() calls constructor of ArrayList
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
//		showTheList();
		changeTheList();
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

	private void changeTheList()
	{
		display.displayText("The list is currently this big: " + donutList.size());
		Donut removed = donutList.remove(0);		//Removes first item in the list
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it contains " + donutList.size() + " items");
		donutList.add(removed);		//Adds previously removed item back to the list (at the end)
		
		display.displayText("The list still contains: " + donutList.size() + " items");
		removed = donutList.set(3,  new Donut());
		display.displayText("The " + removed.getFlavor() + " donut has been removed");
		
		Donut coconut = new Donut("coconut");
		donutList.add(coconut);
		display.displayText("You have added a " + donutList.get(6) + " donut");
		
		Donut deleted = donutList.remove(3);
		display.displayText("You have removed the " + deleted.getFlavor() + " donut from the list");
		
		for(int loop = 0; loop <= donutList.size(); loop += 1)
		{
			display.displayText("I'm a Donut!");
		}
	}

	
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}
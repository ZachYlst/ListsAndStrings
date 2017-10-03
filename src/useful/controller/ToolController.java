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
	}
	
	private void showTheList()
	{
		for (int index = 0; index < donutList.size(); index += 1)
		{
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

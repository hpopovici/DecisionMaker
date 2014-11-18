package com.decisionmaker;

import java.util.ArrayList;

public class DecisionController {
	//store the decision item in an array list
	public static ArrayList<Decision> myList = new ArrayList<Decision>();
	
	public static void storeDecisionInMemory(Decision decision){
		myList.add(decision);
	}
	
}

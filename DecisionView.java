package com.decisionmaker;

import java.util.ArrayList;

public class DecisionView {
	public static void display(ArrayList<Decision> myList){
		
		//print all the items, their type, and their weight
		for (int i = 0; i <= (myList.size()-1); i++){
			System.out.println("Item: "+myList.get(i).getItem()+" --- Type: "+myList.get(i).getType()+" --- Weight: "+myList.get(i).getWeight());
		}
		
		
		//print the totals for pros and cons
		DecisionCalculator.calculate(DecisionController.myList);
		System.out.println();
		System.out.println("PRO: "+DecisionCalculator.getPro_count()+"    CON: "+DecisionCalculator.getCon_count());
		System.out.println();
		
		//print the winner
		System.out.println("Decision: "+DecisionCalculator.getWinner());
	}
}

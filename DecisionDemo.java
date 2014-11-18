package com.decisionmaker;

import java.util.Scanner;

public class DecisionDemo {

	public static void main(String[] args) {
		
		String item;
		int weight;
		String type;

		Scanner in = new Scanner(System.in);
		// need this so scanner works properly
		in.useDelimiter("\\n");

		//lets the user input three items in their decision table
		for (int i = 0; i <= 1; i++){
		
			System.out.println("Enter the item you want to add to your list:");
			item = in.next();
			System.out.println("Enter its relative weight (1-10):");
			weight = in.nextInt();
			System.out.println("Is it a PRO or a CON?:");
			type = in.next();
		
			Decision obj = new Decision();
			obj.setItem(item);
			obj.setWeight(weight);
			obj.setType(type);
			
			DecisionController.storeDecisionInMemory(obj);
		
		}
		
		DecisionView.display(DecisionController.myList);
		in.close();

	}

}

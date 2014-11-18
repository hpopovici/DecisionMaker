package com.decisionmaker;

import java.util.ArrayList;

public class DecisionCalculator {

	private static int pro_count;
	private static int con_count;
	private static String winner;
	
	public static int getPro_count() {
		return pro_count;
	}

	public static int getCon_count() {
		return con_count;
	}
	
	public static String getWinner(){
		return winner;
	}

	public static void calculate(ArrayList<Decision> myList){
		for (int i = 0; i <= (myList.size()-1); i++){
			if (myList.get(i).getType().equals("PRO")){
				pro_count += myList.get(i).getWeight();
			} else if (myList.get(i).getType().equals("CON")){
				con_count += myList.get(i).getWeight();
			}
		}
		
		if (pro_count < con_count){
			winner = "CON wins!";
		} else if (pro_count > con_count){
			winner = "PRO wins!";
		} else if (pro_count == con_count){
			winner = "Tie! Filp a coin!";
		}
		
	}
	
}

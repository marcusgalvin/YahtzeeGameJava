package com.example.demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dice {
	int die1, die2, die3, die4, die5;
	int numberOfDice;
	
	
	ArrayList<Integer> hand = new ArrayList<Integer>();

	
	public int roll() {
		//user's collection of dice
		
		//randomizer class, add +1 to ignore 0s
		Random random = new Random();
		
		//user input
		Scanner dieAmt = new Scanner(System.in);
		System.out.println("Please enter the number of dice to roll: ");
		int amtOfDiceRolled = dieAmt.nextInt();
		
		
		
		die1 = random.nextInt(6) + 1;
		hand.add(die1);
		die2 = random.nextInt(6) + 1;
		hand.add(die2);
		die3 = random.nextInt(6) + 1;
		hand.add(die3);
		die4 = random.nextInt(6) + 1;
     	hand.add(die4);
		die5 = random.nextInt(6) + 1;
		hand.add(die5);
		
		
		
//		switch(amtOfDiceRolled) {
//		
//		case 1:
//			System.out.println("die 1: " + die1);
//			break;
//		case 2:
//			System.out.println("die 1: " + die1);
//			System.out.println("die 2: " + die2);
//			break;
//		case 3:
//			System.out.println("die 1: " + die1);
//			System.out.println("die 2: " + die2);
//			System.out.println("die 3: " + die3);
//			break;
//		case 4:
//			System.out.println("die 1: " + die1);
//			System.out.println("die 2: " + die2);
//			System.out.println("die 3: " + die3);
//			System.out.println("die 4: " + die4);
//			break;
//		case 5:
//			System.out.println("die 1: " + die1);
//			System.out.println("die 2: " + die2);
//			System.out.println("die 3: " + die3);
//			System.out.println("die 4: " + die4);
//			System.out.println("die 5: " + die5);			
//
//		}
		
//		System.out.println(die2);

		System.out.println("starting hand: " + hand);
		
		return 0;
	}
	
	public int reRoll() {
		Scanner pick = new Scanner(System.in);
		Scanner one = new Scanner(System.in);

		System.out.println("Choose dice to keep: ");
		int kept = pick.nextInt();
		
		for(int i = 0; i < hand.size(); i++) {
			if(kept == i) {
				hand.remove(i);
			}
		}
		
		System.out.println("current hand" + hand);
		System.out.println("dice kept on table: " + kept);
		
//		System.out.println("Press 1 for reRoll OR Press 2 to pick up another die");
//		int reRoll = one.nextInt();
//		if(reRoll == 1) {
//			
//		}
//		

		
		
		
		return 0;
	}
	
	
	
	

}

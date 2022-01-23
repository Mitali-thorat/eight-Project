package com.SwitchCase;

import java.util.Scanner;

public class Example1
{

	public static void main(String[] args)
	{
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the input value: ");

		String str = scn.next();
		
		switch(str)
		{
	case "0":
	case "1":
	case "2":
	case "3":
	case "4":
	case "5":
	case "6":
	case "7":
	case "8":
	case "9":
		
		System.out.println("your charecter is DIGIT");
		break;
		
	case "a":
	case "A":
	case "b":
	case "B":
	case "c":
	case "C":
	case "D":
	case "e":
	case "E":
	case "f":
	case "F":
	case "g":
	case "G":
	case "h":
	case "H":
	
		System.out.println("The given Charector is ALPHABET");
		break;
		
		default:
			System.out.println("The given charecter is SPECIAL CHARACTERS");
			break;
			
		


		
		}
		
		
		
	}

}

package main.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		String repeat = "y";
		Scanner sc = new Scanner(System.in);
		do {
		
		System.out.println("String Joiner");
		System.out.println("Enter First String");
		String str1 = new String(sc.nextLine());
		System.out.println("Enter the Second Line");
		String str2 =  new String(sc.nextLine());
		System.out.println("Combined String");
		System.out.println(combiner(str1,str2));
		System.out.println("Do you want to repeat:(y,n)");
		repeat = sc.nextLine();
		

	}while(repeat.equalsIgnoreCase("y"));
		sc.close();
		System.out.println("End of Program");
	}

	public static String combiner(String str1, String str2) {
		return str1+str2;
	}

}

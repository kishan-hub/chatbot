package com.basic.testify.Basic;

import java.util.Scanner;

public class NextLineTrap {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		//nextInt() Example
		int yourAge =scanner.nextInt();
		int friendAge=scanner.nextInt();
		int parentAge=scanner.nextInt();
		
		System.out.println("Ages: You - "+yourAge+",Friend - "+friendAge+", Parent - "+parentAge);
		
		System.out.println("\n Enter a greeting: ");
		String greeting  =scanner.next();
		
		//nextDouble() example 
		System.out.println("Enter the price of Book coffee and a meal");
		double bookPrice =scanner.nextDouble();
		double coffeePrice =scanner.nextDouble();
		double mealPrice=scanner.nextDouble();
		
		System.out.println("Prices: Book - "+bookPrice+", Coffee - "+coffeePrice+", Meal - "+mealPrice);
		
		System.out.println("\nEnter a restaurant Name ");
		
		String resaurant =scanner.nextLine();
		
		//nextLong() example
		System.out.println("\nEnter the population of three cities:    ");
		
		long city1Population1=scanner.nextLong();
		long city2Population2=scanner.nextLong();
		long city3Population3=scanner.nextLong();
		
		System.out.println("Populations: City1 - "+city1Population1+", City 2 - "+city2Population2+", City 3 - "+city3Population3);
		
		System.out.println("\nEnter the name of most populus city: ");
		String cityName =scanner.nextLine();
		 
		System.out.println("Most populous city: "+cityName);
		
		//next() example
		
		System.out.println("\nEnter three colors: ");
		String color1 =scanner.next();
		String color2=scanner.next();
		String color3=scanner.next();
		
		System.out.println("Colors: 1 - "+color1+",2 - "+color2+",3 - "+color3);
		
		System.out.println("Enter your Favourate color Combination: ");
		String colorCombination =scanner.nextLine();
		System.out.println("Favorite color combination: "+colorCombination);
		scanner.close();
	}

}

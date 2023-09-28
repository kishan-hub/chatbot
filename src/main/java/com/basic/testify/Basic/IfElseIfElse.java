package com.basic.testify.Basic;

import java.util.Scanner;

public class IfElseIfElse {
    
	public static void main(String[] args) {
		
		Scanner scaner =new Scanner(System.in);
		System.out.println("Enter The grade of Student: ");
		int grade = scaner.nextInt();
		
		if(grade >=80) {
			System.out.println("you got an A");
		}
		else if(grade >=70){
			System.out.println("You got a B");
		}else if(grade >=60) {
			System.out.println("You got a C");
		}else if(grade >=50) {
			System.out.println("you got a D");
		}else {
			System.out.println("You got an F");
		}
		
	}
}

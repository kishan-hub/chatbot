package com.basic.testify.Basic;

public class IfElse {
	
	public static void main(String[] args) {
		
		int chemsitryGrade=95;
		int biologyGrade =75;
		
		System.out.println("Me:Hi Java Did i score better in bioLogy?");
		//And if-else statement here
		
	      if(chemsitryGrade>biologyGrade) {
	    	  System.out.println("yes");
	      }
	      else {
	    	  System.out.println("No");
	      }
	      
	      double temperature =15.5;
	      double targetTemparature=20.0;
	      System.out.println("Me: Hi Java is the Temprature colder than our target ");
	       if(temperature >targetTemparature) {
	    	   System.out.println("No");
	       }else {
	    	   System.out.println("Yes");
	       }
	       
	       int currentSpeed = 60;
	       int speedLimit= 70;
	       
	       System.out.println("Hi Java,am i driving slower than the speed limit?");
	       
	       if(currentSpeed<speedLimit) {
	    	   System.out.println("Yes");
	       }else {
	    	   System.out.println("No");
	       }
	       
	       int age =45;
	       int retirementAge =65;
	       
	       System.out.println("Me: Hi Java ,am i old enough to retire");
	       
	       if(age<=65) {
	    	   System.out.println("No");
	       }else {
	    	   System.out.println("yes");
	       }
	       char myGrade ='A';
	       char bestGrade='A';
	       System.out.println("Me:Hi Java, did i get the best possible grade");{
	    	   
	    	   if(myGrade>'B') {
	    		   System.out.println(myGrade);
	    	   }
	    	   else {
	    		   System.out.println(bestGrade);
	    	   }
	    	  
	    	  String word ="hello";
	    	  String secondWord ="hello1";
	    	  System.out.println("Me: Are the two words the same");
	    	  
	    	    if(myGrade ==bestGrade) {
	    	    	System.out.println("Congrats,you got the highest score");
	    	    }else {
	    	    	System.out.println("No,but you will next time!");
	    	    }
	    	  String thirdWord ="hello";
	    	  String fourthWord="goodbye";
	    	  System.out.println("Me: Are the two words different");
	    	  //Add if-else statement here
	    	 
	    	  
	       }
	}
	
	

}

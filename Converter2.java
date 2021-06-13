package main;

import java.util.Scanner;

public class Converter2 {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			  int exchange=sc.nextInt();
			if(exchange == -1 || exchange== 6) 
				break;
			switch (exchange) {
		    case 1:
		    	System.out.println("Enter the number of Miles");
		    	double miles=sc.nextDouble();
		    	if(miles>=0) {
		    		System.out.println(miles+"miles is"+miles*1.609+"Kilometers");
		    	}else {
		    		System.out.println("please put in positive number of miles");
		    	}
		    	break;
		     case 2:
		    	  System.out.println("Enter the number of US Gallons");
			    	double USGallons=sc.nextDouble();
			    	if(USGallons>=0) {
			    		System.out.println(USGallons+"US Gallons is"+USGallons*0.833+"Imperial Gallons");
			    	}else {
			    		System.out.println("please put in positive number of USGallons");
			    	}
			    	break;
		       case 3:
		    	  System.out.println("Enter the number of US Gallons");
			    	double cups=sc.nextDouble();
			    	if(cups>=0) {
			    		System.out.println(cups+"Cups is"+cups*48+"Teaspoons");
			    	}else {
			    		System.out.println("please put in positive number of Cups");
			    	} 
			    	 break;
		    }
		}
		
	 
		}

	


	}



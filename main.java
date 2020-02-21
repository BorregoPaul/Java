import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		while (true) {
			String [] array1 = {"It's ", "over ", "Anakin. ", "I", "have", "the", "high", "ground"};
			String [] array2 = {"You ", "Underestimate ", "my ", "POWER"};

			Adjective myObjadj = new Adjective(); // Creates Objects
		    Scanner myObjscan = new Scanner(System.in);  // Create a Scanner object
		    Percent myObjperc = new Percent();
		    
		    myObjperc.setPercent(100); // Setters
		    myObjadj.setAdj("okay");

		    System.out.println("Give me a noun. "); //Input
	  	    String myNoun = myObjscan.nextLine();

	  	    System.out.println("Give me a number (Preferably less than 100). ");
	  	    int myNumber = myObjscan.nextInt();
	  	    
	  	    System.out.println("");

	     
	        for (int i = 0; i < 13; i++) { //for loop and if else, Didn't know what to do so I did the prequels:(
	        	if (i < 8) {
	        	System.out.println(array1[i]);
	        	}
	        	else if (i == 8) {
	            	System.out.println("");

	        	}
	        	else if (i < 13) {
	            	System.out.println(array2[i - 9]);

	        	}
	        }
	        System.out.println(""); 
	        System.out.println(myNoun + " is " + myNumber +"% useless" ); // Prints stuff
		    System.out.println( "That's "+ myObjperc.getPercent() + "% "+myObjadj.getAdj());
		    break;
		  }
		}
		}
		
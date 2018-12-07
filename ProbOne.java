// package AlgHW1Final ; 

public class ProbOne {
	
	// Loops over input items in a single loop and prints the 
	// 		elapsed time taken by function in milliseconds 
	static void linearFunction (int N) { 
		
		// set start time
		double start = System.nanoTime() ; 
		
		// for loop 
		double sum = 0 ; 
		for (int i = 0 ; i <= N ; i++) {
			sum += i ; 
		}
		
		// set end time 
		double end = System.nanoTime() ; 
		
		// print out total time it took program to run (converted from nanoseconds to milliseconds) 
		System.out.println("The time it took the linear function to execute was " + ((end - start)/1000000)) ;
	
	}
	
	

	// Loops over input items in two loops and prints the 
	// 		elapsed time taken by function in milliseconds 
	static void quadraticFunction (int N) { 
		
		// set start time
		double start = System.nanoTime() ; 
		
		// for loop 
		double sum = 0 ; 
		for (int i = 0 ; i <= N ; i++) {
			for (int j = 0 ; j <= N ; j++) {
				sum += j ; 
			}
		}
		
		// set end time
		double end = System.nanoTime() ; 
		
		// print out total time it took program to run (converted from nanoseconds to milliseconds) 
		System.out.println("The time it took the quadratic function to execute was " + ((end - start)/1000000)) ;
	
	}
	
	// Loops over input items in three loops and prints the 
	// 		elapsed time taken by function in milliseconds 
	static void cubicFunction (int N) { 
		
		// set start time 
		double start = System.nanoTime() ; 
		
		// for loop 
		double sum = 0 ; 
		for (int i = 0 ; i <= N ; i++) {
			for (int j = 0 ; j <= N ; j++) {
				for (int k = 0 ; k <= N ; k++) {
					sum += j ; 
				}
			}
		}
		
		// set end time
		double end = System.nanoTime() ; 
		
		// print out total time it took program to run (converted from nanoseconds to milliseconds) 
		System.out.println("The time it took the cubic function to execute was " + ((end - start)/1000000)) ;
	
	}

	

	public static void main (String[] args) {

		// convert command line arguments from string to integer 
		int input = Integer.parseInt(args[0]) ; 

		// assume N = 100,000 by the assignment 
		int N = 100000 ; 
		
		// if the command line input = 1, run the linear function 
		if (input == 1) {
			linearFunction (N) ; 
		}
		
		// if the command line input = 2, run the quadratic function 
		if (input == 2) {
			quadraticFunction (N) ; 
		} 
		
		// if the command line input = 3, run the cubic function 
		if (input == 3) {
			cubicFunction (N) ; 
		}
		
		// else invalid input
		if ((input != 1) && (input != 2) && (input != 3)) {
			System.out.println("Invalid input") ; 
		}

 
	}

}
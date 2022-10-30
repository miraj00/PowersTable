import java.io.*;
import java.util.Scanner;

public class PowersTable {

	
	
	public static void main (String[] args) {
		
		int num, square, cube;          
				
		Scanner sc = new Scanner(System.in);
							
		System.out.println("Learn your square & cubes ! " );	
				
		System.out.print("Enter an Integer : ");		
		num = sc.nextInt();

		System.out.println("  Number        Squared        Cubed ");
		System.out.println("==========     =========     =========");


		
		for (int i =1; i <=num ; i++ ) {
		
			square = i * i;
			cube = i * i * i;
		
	//		System.out.println( "     " + i + "             " + square + "            " +cube );     // (option 1)			
			System.out.println();
			String str0 = String.format("%3d", i);
			String str1 = String.format("%16d", square);
			String str2 = String.format("%16d", cube);
			System.out.print(str0);
			System.out.print(str1);
			System.out.print(str2);		
			System.out.println();	
		}	
		
		System.out.println();
		System.out.println(" Multiplication Table" + "\n");
		System.out.print("  ");

        for (int i =1; i <=num ; i++ ) {
		
		System.out.print( i + "    ");                              // To Print horizontal first line of numbers
		}
		System.out.println();

		
		
		for (int i =1; i <=num ; i++ ) {
		
		System.out.print("  " + "="+ "  ");							// To Print double line under the numbers
		}
		System.out.println();
		
		
		
		for (int i=1; i<=num; i++) {								
						 
			System.out.print( i + "|");  							// To Print vertical line of numbers 
		
			
				for (int j=1; j<=i; ++j) {
			
				System.out.print( (i * j) + "    ");				// To Print multiplication of numbers loop
				}
			
			System.out.println("");
		}
		
		
	    System.out.print(" Continue ? (Y/N) : "); 
        String var= sc.next();
   
        if(var.equalsIgnoreCase("Y")){                      // Matches "Y" or "y"
     		main(null);                                     // if input is Y then call main method again to repeat questionaire. 
        } else {
			System.out.println("Bye !");
		}
	}

}		





/*   **************************************  Requirements  *********************************************************

Powers Table
Loops
Task: Pair program and display a table of powers.

What will the application do?
Prompt the user to enter an integer.
Display a table of squares and cubes from 1 to the value entered.
Ask if the user wants to continue.

Build Specifications
Assume that the user will enter valid data.
Only continue if the user agrees to.

Hints:
Don’t mess up the difference between squares and cubes! 
ZyBook Chapter 4 - Loops
ZyBook 9.2 - Output formatting

Console Preview: 

Learn your squares and cubes!

Enter an integer: {user input here, for example: 5}

Number               Squared                  Cubed
=======              =======                  ======
1                       1                       1
2                       4                       8
3                       9                       27
4                       16                     64
5                       25                     125

Continue? (y/n): {user input here, for example: Y}

Enter an integer: …


Extended Challenge:
Add a multiplication table to the end. For example…

    1   2   3   4
    =   =   =   = 
1 | 1   2   3   4
2 | 2   4   6   8
3 | 3   6   9  12
4 | 4   8  12  16


*/
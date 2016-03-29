package BubbleSort;
//This program has been written to sort an arry and add an element at the end of an array.
import java.util.Scanner;
public class BubbleSort {
	
		int Array[] = new int[5];			//Declaring array of integer. 
	
	public void AcceptArray()
		{
		
			
				Scanner sC = new Scanner(System.in); //creating an object of array.
				
				System.out.println("");					// next line.
				System.out.println("Please enter five numbers: ");	// input to arrays.
				for (int Pos = 0; Pos < 5; Pos++)		// for loop to accept numbers into array.
				{
					
					Array[Pos] = sC.nextInt();
					
				}
				
				System.out.println("Unsorted array: ");	//Printing unsorted array.
				
				for (int Pos = 0; Pos < 5; Pos++)    // For loop to print array.
				{
					
					System.out.print(" " + Array[Pos]);
					
				}

		}
		

		public void SortArray() //Method to bubble sort an array.
		{
			int j=0;			// Declaration of variables.
			int Temp = 0;
			
			
			for(int i = 0; i < Array.length; i++)			// Outer for loop.
			{
				for(j = i+1; j < Array.length; j++)			// Inner for loop to compare one number with the rest of the numbers in the array.
			{
			if(Array[i] > Array[j] )			//If condition to compare the numbers.
			{
				
				Temp = Array[j];
				Array[j]= Array[i];
				Array[i]=Temp;
			}
			}
			}
			System.out.println("");
			System.out.println("Sorted array: ");
			for (int Pos = 0; Pos < Array.length; Pos++)	// for loop to print sorted array.
			{
			
						
				System.out.print(" " + Array[Pos]);
				
			}
		}
		public void AddAnElement()			// This method is to add an element at the end of an array.
		{
			

			int Destination[] = new int[6]; // Declaration of arrays.
			int Element;							
			Scanner cS = new Scanner(System.in);

			
			System.out.println("");								// Print new line.
			System.out.println("Please enter the element you want to add to array : ");
			Element = cS.nextInt();								// accepting the number to be added at the end of array. 
	
			System.out.println("");
			System.out.println("The element is added at the end of array :");
			for (int Pos = 0; Pos < 5; Pos++)				// For loop to copy contents of array to another array.
			{
				
				Destination[Pos] = Array[Pos];
								
				
			}

						
			Destination[5]=Element;		// Addition of an element to the end of array.
					
			
			for (int Pos = 0; Pos < 6; Pos++)		// For loop to print the array.
			{
				
				System.out.print(" " + Destination[Pos]);	
				
			}
			
		
		}
		
	public static void main(String[] args) {
		
		BubbleSort objBubble = new BubbleSort();		// creating an object of class.
		objBubble.AcceptArray();						// Calling method to accept array.
		objBubble.SortArray();							// Calling method to Sort an array.
		objBubble.AddAnElement();						// Calling method to add an element at the end of an array.
		
	}

}

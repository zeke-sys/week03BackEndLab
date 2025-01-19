package week03;

import java.util.Arrays;

public class Week03Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int [] numberArray = {1, 5, 2, 8, 13, 6};
		System.out.println(Arrays.toString(numberArray)); //we can either use the Arrays.toString or a for loop to print the array in number 6.
		

		
		// 2. Print out the first element in the array
		
		System.out.println("The first element in the array is " + numberArray[0]);
		
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println("The last element in the array is " + numberArray[numberArray.length - 1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
		
		System.out.println("The element in the array at position 6 is doesn't exist. Code throws an exception."); //System.out.println(numberArray[6]);

		
		// 5. Print out the element in the array at position -1, what happens?
		
		System.out.println("Code throws an exception. Index -1 out of bounds for length 6.");

			
		// 6. Write a traditional for loop that prints out each element in the array
		
		for (int i=0; i<6; i++) {
			System.out.println(numberArray[i]);
		}
		
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		
		System.out.println("Enhanced for loop numbers are ");
		for (int number: numberArray) {
			System.out.println(number);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		
		int sum = 0;
		for (int j=0; j<numberArray.length; j++) {
			sum += numberArray[j];	
		}
		
		System.out.println("Sum is " + sum);
		
		/* Another way to do this
		 * 
		 * for (int number: numberArray) {
		 
			sum += number;
		}
		
		System.out.println("Sum is " + sum);
		*/

			
		// 9. Create a new variable called average and assign the average value of the array to it
		
		double average;
		average = (sum / numberArray.length);
		
		System.out.println("The average value of the array is " + average);
		

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
		for (int number: numberArray) {
			if (number % 2 != 0) {
			System.out.println(number);
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		
		String [] names = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array

		int letterCount = 0;
		for (String name: names) {
			System.out.println(name);
			letterCount += name.length();
		}
		System.out.println("The sum of all the letters in the new array is " + letterCount);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greet("Alice");
		greet("Bob");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		
		System.out.println("\nQuestion 14");
		String greeting = greet2("Tom");
		System.out.println(greeting);

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		String word = "ahead";
		int testNumber = 7;
		
		
		System.out.println("This sentence is " + isTrue(word, testNumber) + ".");
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		String [] arrayOfString = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		String oneString = "Friday";
		
		System.out.println("Question 16 returns " + isStringInArray(arrayOfString, oneString));
		
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		
		int[] array1 = {5, 2, 8, 1, 9};
		int[] array2 = {-3, 0, 7};
		int[] array3 = {-20, 5, -30, 6, -100};
		
		System.out.println("The smallest number in the array is " + smallestNumber(array1));
		System.out.println("The smallest number in the array is " + smallestNumber(array2));
		System.out.println("The smallest number in the array is " + smallestNumber(array3));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] myArray = {3.24, 5.13, 6.12, 6.40};
		
		System.out.println("The average is " + findAverageDouble(myArray));
		
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		String[] otherArray = {"good", "bad", "nah", "alright", "enough"};
		int[] intArray = convertString(otherArray);
		System.out.println("The converted String Array into Int is " + Arrays.toString(intArray)); //Print the converted strings into ints using this or a loop
		
		for (int number: intArray) { //either print statement above or this loop
			System.out.println(number);
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		System.out.println("Question 20 - This method returns " + isGreater(otherArray));
		
		
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome (word, phrase, number, or other sequence that reads the same forward and backward)

		
		String word1 = "racecar";
		String word2 = "eve";
		String word3 = "rotator";
		String word4 = "sickness";
		String word5 = "reviver";
		
		System.out.println("\t -" + isPalindrome(word1));
		System.out.println("\t - " + isPalindrome(word2));
		System.out.println("\t - " + isPalindrome(word3));
		System.out.println("\t - " + isPalindrome(word4));
		System.out.println("\t - " + isPalindrome(word5));
		
		
}
	

	
	// Method 13:
	public static void greet(String name) {
		System.out.print("Hello, " + name + "!");
	}


	// Method 14:
	public static String greet2(String name) {
		return ("Hi, " + name + "!");
	}

	
	// Method 15:
	public static boolean isTrue (String string, int number) {
		return string.length() > number;
	}

	
	// Method 16:
	public static boolean isStringInArray (String[] array, String string) {
		 for (String arrayString: array) {
			if (arrayString.equals(string)) {
				return true;
			}
		}
		 return false;
	}

	
	// Method 17:
	public static int smallestNumber(int[] arrayOfNumbers) {
		/*if (arrayOfNumbers == null || arrayOfNumbers.length == 0) { //addressing error if array is null or empty
			System.out.println("Array cannot be empty or null!");
			//throw new IllegalArgumentException("Array cannot be empty or null!"); //This can be used as well.
		}*/
		
		int smallest = arrayOfNumbers[0]; //assuming the first number in index 0 is the smallest initially
		for (int number: arrayOfNumbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;

	}
		


	
	// Method 18:
	public static double findAverageDouble (double[] arrayOfAverages) {
		double sum = 0.0;
		for (double average: arrayOfAverages) {
			sum += average;
		}
		return sum / arrayOfAverages.length;
	}

	
	// Method 19:
	public static int[] convertString(String[] array) {
		int[] results = new int[array.length];
		
		int i = 0;
		for (String string : array) { //enhanced for loop but could use the char i
			results[i] = string.length();
			i++;
		}
		return results;
	}

	
	// Method 20:
	public static boolean isGreater (String[] thisArray) {
		int evenSum = 0;
		int oddSum = 0;
		
		for (String arrayString : thisArray) {
			if (arrayString.length() % 2 == 0) {
				evenSum += arrayString.length();
			} else {
				oddSum += arrayString.length();
			}	
		}
		return evenSum > oddSum;
	}
	
	
	// Method 21:
	public static boolean isPalindrome(String string) {
		String reversedString = "";
		for (int i = string.length() - 1; i >= 0; i--) {//reverse the string
			reversedString += string.charAt(i);
		}
		System.out.println(reversedString);
		return string.equals(reversedString);
	}
	
	

}

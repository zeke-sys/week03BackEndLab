package week03;

import java.util.Arrays;

public class Week03Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

		int[] numberArray = { 1, 5, 2, 8, 13, 6 };
		System.out.println(Arrays.toString(numberArray)); // we can either use the Arrays.toString or a for loop to
															// print the array in number 6.

		// 2. Print out the first element in the array

		System.out.println("The first element in the array is " + numberArray[0]);

		// 3. Print out the last element in the array without using the number 5

		System.out.println("The last element in the array is " + numberArray[numberArray.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?

		System.out.println("The element in the array at position 6 is doesn't exist. Code throws an exception."); // System.out.println(numberArray[6]);

		// 5. Print out the element in the array at position -1, what happens?

		System.out.println("Code throws an exception. Index -1 out of bounds for length 6.");

		// 6. Write a traditional for loop that prints out each element in the array

		for (int i = 0; i < 6; i++) {
			System.out.println(numberArray[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array

		System.out.println("Enhanced for loop numbers are ");
		for (int number : numberArray) {
			System.out.println(number);
		}

		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum

		int sum = 0;
		for (int j = 0; j < numberArray.length; j++) {
			sum += numberArray[j];
		}

		System.out.println("Sum is " + sum);

		/*
		 * Another way to do this
		 * 
		 * for (int number: numberArray) {
		 * 
		 * sum += number; }
		 * 
		 * System.out.println("Sum is " + sum);
		 */

		// 9. Create a new variable called average and assign the average value of the
		// array to it

		double average;
		average = (sum / numberArray.length);

		System.out.println("The average value of the array is " + average);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd

		for (int number : numberArray) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"

		String[] names = { "Sam", "Sally", "Thomas", "Robert" };

		// 12. Calculate the sum of all the letters in the new array

		int letterCount = 0;
		for (String name : names) {
			System.out.println(name);
			letterCount += name.length();
		}
		System.out.println("The sum of all the letters in the new array is " + letterCount);

		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.

		greet("Alice");
		greet("Bob");

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.

		System.out.println("\nQuestion 14");
		String greeting = greet2("Tom");
		System.out.println(greeting);

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int

		String word = "ahead";
		int testNumber = 7;

		System.out.println("This sentence is " + isTrue(word, testNumber) + ".");

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array

		String[] arrayOfString = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		String oneString = "Friday";

		System.out.println("Question 16 returns " + isStringInArray(arrayOfString, oneString));

		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array

		int[] array1 = { 5, 2, 8, 1, 9 };
		int[] array2 = { -3, 0, 7 };
		int[] array3 = { -20, 5, -30, 6, -100 };

		System.out.println("The smallest number in the array is " + smallestNumber(array1));
		System.out.println("The smallest number in the array is " + smallestNumber(array2));
		System.out.println("The smallest number in the array is " + smallestNumber(array3));

		// 18. Write and test a method that takes an array of double and
		// returns the average

		double[] myArray = { 3.24, 5.13, 6.12, 6.40 };

		System.out.println("The average is " + findAverageDouble(myArray));

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position

		String[] otherArray = { "good", "bad", "nah", "alright", "enough" };
		int[] intArray = convertString(otherArray);
		System.out.println("The converted String Array into Int is " + Arrays.toString(intArray)); // Print the
																									// converted strings
																									// into ints using
																									// this or a loop

		for (int number : intArray) { // either print statement above or this loop
			System.out.println(number);
		}

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.

		System.out.println("Question 20 - This method returns " + isGreater(otherArray));

		// not part of question 20 but part of quiz
		String name = "Zeke";
		Boolean isLong = false;

		System.out.println("Question 20 - " + createGreeting(name, isLong));

		// part of quiz - based raised to the power of exponent
		int base = 3;
		int exponent = 4;

		System.out.println("Quiz return - " + power(base, exponent));

		// part of quiz
		String wordQuiz = "hey";
		int number1 = 5;

		System.out.println("Quiz return - " + concatenateWord(wordQuiz, number1));

		int l = 2;
		int m = 4;
		int n = 5;

		System.out.println(returnSum(l, m, n));

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome (word, phrase, number, or other
		// sequence that reads the same forward and backward)

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

		// Additional Practice
		// -> Write a method called SumOfDigits that takes an integer variable called
		// digits.
		// Then return the sum of all the digits in digits in Java using a for loop.

		int digits = 2341;

		// see method below under Practice method
		System.out.println("Practice method - The sum is " + sumOfDigits(digits));

		// ----------------

		// If we just want to iterate over an integer number, we do the following

		String digitsString = Integer.toString(digits);

		for (int i = 0; i < digitsString.length(); i++) {
			System.out.println(Character.getNumericValue(digitsString.charAt(i)));
		}

		/*
		 * Complete the method called passwordChecker that accepts the String stored in
		 * variable password. The method should check to make sure that password is at
		 * least 8 characters in length and contains one of 4 special symbols, !, $, %,
		 * or & The method should return true or false.
		 */

		String password = "password%";

		boolean meetsRequirement = passwordChecker(password);
		if (meetsRequirement) {
			System.out.println("The password " + password + " meets the requirements.");
		} else {
			System.out.println("The password " + password + " does not meet the requirements.");
		}

		// avgNameLength Method (see below)

		String[] namesBunch;
		namesBunch = new String[5];

		namesBunch[0] = "Maria";
		namesBunch[1] = "Skip";
		namesBunch[2] = "Juan";
		namesBunch[3] = "Luna";
		namesBunch[4] = "Ted";

		System.out.println("The average length of all the names is " + avgNameLength(namesBunch));

		// rectanglePerimeter

		int length = 4;
		int width = 2;

		System.out.println("The perimeter of the rectangle is " + rectanglePerimeter(length, width));

		System.out.println(whatsReturned(9, "Hi, There", false, 4.99, 'T'));

		/*
		 * Given the variable userWord, create a new Array that is made up of the
		 * characters of the word stored in the variable. Initialize a new Array, name
		 * it whatever you want Make sure to use the correct Java data type for this new
		 * Array (data type char). Add each letter of userWord to the Array as elements
		 * Once you have populated the Array, print to the console each element of the
		 * Array
		 */
		
		String userWord = "programmer";
		
		charArray(userWord);
		
		//--------------
		
		//Using clone
		int[] arr = { -11, 43, 901, 72, -5};
		int[] arr2 = arr.clone();

		System.out.println("- Clone - " + arr2[3]);
		
		
		
		

	} // end of main

	// ----<Methods created for practice scenarios>----
	
	
	//Character charArray Method
	public static void charArray(String userWord) {
		char[] arr = new char[userWord.length()];
		
		for (int i=0; i<userWord.length(); i++) {
			arr[i] = userWord.charAt(i);
		}
		
		for (int j=0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
	
	
	

	// whatsReturned
	public static boolean whatsReturned(int num1, String words, boolean TF, double price, char letter) {
		return TF;
	}

	// rectanglePerimeter Method
	/*
	 * Inside of the public class, write a static method called rectanglePerimeter :
	 * The method should accept two int variables named length and width In the body
	 * of the method write a program that will calculate the perimeter of the
	 * rectangle The method should return an integer value representing the
	 * perimeter of the rectangle
	 * 
	 */

	public static int rectanglePerimeter(int length, int width) {
		return (2 * (length + width));
	}

	// avgNameLength Method
	/*
	 * Given a method called avgNameLength that takes in an Array of String stored
	 * in names, write a program that will traverse the array. The method
	 * avgNameLength will find the average length of all names that are part of
	 * names Return the average length of all names
	 * 
	 */
	public static int avgNameLength(String[] names) {
		int total = 0;

		for (int i = 0; i < names.length; i++) {
			total += names[i].length();
		}
		return total / names.length;
	}

	// passwordChecker Scenario
	public static boolean passwordChecker(String password) {
		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == '!' || password.charAt(i) == '$' || password.charAt(i) == '%'
						|| password.charAt(i) == '&') {
					return true;
				}
			}
		}
		return false;
	}

	// passwordChecker Scenario - another way to write the if condition
	/*
	 * if (password.length() >= 8 && (password.contains("!") ||
	 * password.contains("$") || password.contains("%") || password.contains("&")))
	 * { return true; }
	 *
	 */

	// part of week 3 quiz - create method to greet user if it's been a long time
	// since you last saw each other
	public static String createGreeting(String name, boolean isLong) {

		if (isLong) {

			return "Welcome, " + name + ". We have waited a long time for you.";

		}

		return "Hi, " + name + ".";

	}

	// Part of week 3 quiz - This method takes two parameters which are integers,
	// base, and exponent, and return the base raised to the power of exponent.

	public static int power(int base, int exponent) {
		int result = 1;
		for (int index = 1; index <= exponent; index++) {
			result = result * base;
		}
		return result;
	}

	// Part of week 3 quiz - Write a method that takes a String word and an integer
	// number. The method should return a String concatenated to itself the number
	// of times of the integer parameter.

	public static String concatenateWord(String word, int number) {
		String result = "";
		for (int index = 1; index <= number; index++) {
			result = result + word;
		}
		return result;
	}

	// Practice Method
	public static int sumOfDigits(int digits) {
		int sum = 0;

		String digitsString = Integer.toString(digits); // Convert integer to a string to iterate over each digit

		for (int i = 0; i < digitsString.length(); i++) {
			sum += Character.getNumericValue(digitsString.charAt(i)); // get the character at position i, convert it to
																		// an integer, and add it to the sum
		}
		return sum;
	}

	/*
	 * Using a while loop and finding the remainder and iterate
	 *
	 * int result = 0;
	 * 
	 * while(digits > 0) { result += digits % 10; digits /= 10; } return result;
	 */

	// -------------- All Methods to the questions above, starting with 13
	// -------------

	// Method 13:
	public static void greet(String name) {
		System.out.print("Hello, " + name + "!");
	}

	// Method 14:
	public static String greet2(String name) {
		return ("Hi, " + name + "!");
	}

	// Method 15:
	public static boolean isTrue(String string, int number) {
		return string.length() > number;
	}

	// Method 16:
	public static boolean isStringInArray(String[] array, String string) {
		for (String arrayString : array) {
			if (arrayString.equals(string)) {
				return true;
			}
		}
		return false;
	}

	// Method 17:
	public static int smallestNumber(int[] arrayOfNumbers) {
		/*
		 * if (arrayOfNumbers == null || arrayOfNumbers.length == 0) { //addressing
		 * error if array is null or empty
		 * System.out.println("Array cannot be empty or null!"); //throw new
		 * IllegalArgumentException("Array cannot be empty or null!"); //This can be
		 * used as well. }
		 */

		int smallest = arrayOfNumbers[0]; // assuming the first number in index 0 is the smallest initially
		for (int number : arrayOfNumbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;

	}

	// Method 18:
	public static double findAverageDouble(double[] arrayOfAverages) {
		double sum = 0.0;
		for (double average : arrayOfAverages) {
			sum += average;
		}
		return sum / arrayOfAverages.length;
	}

	// Method 19:
	public static int[] convertString(String[] array) {
		int[] results = new int[array.length];

		int i = 0;
		for (String string : array) { // enhanced for loop but could use the char i
			results[i] = string.length();
			i++;
		}
		return results;
	}

	// Method 20:
	public static boolean isGreater(String[] thisArray) {
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
		for (int i = string.length() - 1; i >= 0; i--) {// reverse the string
			reversedString += string.charAt(i);
		}
		System.out.println(reversedString);
		return string.equals(reversedString);
	}

	public static int returnSum(int x, int y, int z) {
		int answer = x + y + z;
		return answer;
	}

}

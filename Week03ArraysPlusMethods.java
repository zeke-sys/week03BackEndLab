package week03;

public class Week03ArraysPlusMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays using Grade Book example
		
		//int[] gradesArray = {100, 79, 80, 90, 100}; (Can set and declare the values at the same time or do as seen below.)
		
		int[] gradesArray = new int[5]; //allocating memory for the array
		
		gradesArray [0] = 100; //setting values
		gradesArray [1] = 79;
		gradesArray [2] = 80;
		gradesArray [3] = 90;
		gradesArray [4] = 100;
		
		String firstName = "Mary";
		String lastName = "Brown";
		
		String fullName = firstName + " " + lastName;
		
		System.out.println("Student: " + fullName);
		System.out.println("Grades: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + ": " + gradesArray[i]);
		}
		
		
		
		//Rewrite of Grade Book code but using an enhanced for loop to print the grades
		
		int counter = 1; //adding counter to count the iterations for each grade
		
		System.out.println("Student: " + fullName);
		System.out.println("Grades: ");
		
		for (int grade : gradesArray) {
			System.out.println((counter++) + ": " + grade);
		}
		
		
		
		//calling the below methods/functions
		
		int firstNumber = 3; //variable declarations - visible in Main only
		int secondNumber = 7;
		
		sumTwoNumsPrintResult(firstNumber, secondNumber); //call to first method - passing variables into this Method as parameters!
	
		int result = 0; //additional variable declaration - visible in main only
	
		result = sumTwoNumsReturnResult(firstNumber, secondNumber); //call to second method
	
		System.out.println("The sum is: " + result);
		
		//because the methods have been created, we can invoke them and pass different or additional values
		System.out.println("The new sum is: " + (result + 8));
		
		
	}
	
		
		//Let's define a method
		
		public static void sumTwoNumsPrintResult (int number1, int number2) {
			int sum = 0;
			sum = number1 + number2;
			
			System.out.println("The sum is: " + sum); //no return statement because the returnType is void! Variables only readable within main
		}
		
		//if we want to return a result
		
		public static int sumTwoNumsReturnResult (int num1, int num2) {
		
			int mySum = 0;
			mySum = num1 + num2;
			
			return mySum;
			
		}
		
		
		
				

} //end of Main()

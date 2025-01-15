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
		
		
		//Advanced Topic - Creating a more robust Grade Book - one that takes more students, and store their grades inside the Student Object.
		
		

	}

}

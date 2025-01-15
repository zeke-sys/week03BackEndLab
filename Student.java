package week03;

public class Student { //creating first class for Grade Book scenario without main method
	String fullName = ""; //declaring fullName variable
	int[] grades; //declaring grades array
	
	public Student (String fName, int[] grades) {
		this.fullName = fName;
		this.grades = grades;
	}

	public void describe() {
	System.out.println("Student: " + this.fullName);
	System.out.println("Grades:");
	
	for (int grade : this.grades) { //enhanced for loop
		System.out.println("\t" + grade + " ");
	}
	
	System.out.println();
}

}
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * School Management System 
 * Requirements :
 * Register student / Manage students / Hire teacher /Manage teacher
 */
public class SchoolManagment {
	
	 // This class we will manage school system
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> StudentIDList = new ArrayList<Integer>();
		ArrayList<String>  studentNameList = new ArrayList<String>();
		ArrayList<String>  studentEmailList = new ArrayList<String>();
		
		System.out.println("*********************************************************");
		System.out.println("Welcomt to School Management System ");
		System.out.println("Select an action ");
		System.out.println("1. Register student "); 
		System.out.println("2. Manage students ");
		System.out.println("3. Hire teacher "); 
		System.out.println("4.Manage teacher ");
		System.out.println("*********************************************************");
        int userChoice = scan.nextInt();
		
		if (userChoice == 1)
		{
			
		    System.out.println("You can register Student how many student you wany to enter ?");
		    Integer numberofStudent = scan.nextInt();
		    
		    for (int index = 0 ; index < numberofStudent ; index++)
		    {
		        System.out.println("Enter Student Name : ");
		        String  studentName = scan.next(); //to get student Name 
		        studentNameList.add(studentName); // save the student Name in list
		        System.out.println("Enter Student ID : ");
		        int StudentID = scan.nextInt();        // to get Student ID
		        StudentIDList.add(StudentID);          // save the student ID in list 
		        System.out.println("Enter Student Email : ");
		        String StudentEmail = scan.next();   // to get student Email
		        studentEmailList.add(StudentEmail);  // save the student Email in list
		    }
		    for (int i = 0 ; i < numberofStudent - 1 ; i++)
		    {
			    System.out.println("**************Student Information************************");
			    System.out.println("Student are registerd scssfully");
		        System.out.println("Student Name : " + studentNameList.get(i));
		        System.out.println("Student ID : " + StudentIDList.get(i));
		        System.out.println("Student Email : " + studentEmailList.get(i));
			    System.out.println("*********************************************************");
		    }
		}
		else if(userChoice == 2)
		{
			System.out.println("You can Manage student");

		}
		else if(userChoice == 3)
		{
			System.out.println("you can Hire teacher ");

		}
		else if(userChoice == 4)
		{
			System.out.println("You can Manage teacher");

		}
		else
		{
			System.out.println("wrong selection");

		}
		scan.close();
	}

}

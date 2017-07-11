/*9.1) Create an application having a Generic HashMap with Empcode as key and EmpName as value. */ 

package asst9_1;

/*Java Hash Map is commonly used data structure that is used to store values along with a unique key associated with them. 
Java Hash Map is a Map implementation of HashTable, except that HashMap is not synchronized and permits 
null keys and values. Like other map implementation HashMap itself does not guarantees if the order of elements will 
remain same over the time or not.*/

/*A HashMap object can be obtained as shown below, generics specification is optional but it is always better 
to tell JVM about the type of keys and content that is going to be stored in HashMap. 
Use of generics eliminates the need of explicit type casting. 
//creating a new hash set with String  elements  
HashMap<Integer, String> hashMap = new HashMap<Integer, String>(); 
// using generics --Integer as key and String as value in this case 
*/

import java.util.HashMap;
import java.util.Scanner;
public class Generic_HashMap_demo 
{

	public static void main(String[] args) throws InterruptedException {

		// declare the hashmap
		HashMap<Integer, String> mapemployee = new HashMap<>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);

		// loop while user not entering no
		do {
			// ask for user input for Employee Code
			System.out.print("\nEnter EmployeeCode: ");
			Integer Empcode = Integer.parseInt(scan.nextLine());

			// ask for user input which corresponds to EmpName
			System.out.print("Enter EmployeeName: ");
			String EmpName = scan.nextLine();

			// add the key value pair from user input to the hashmap

			String oldVal = mapemployee.put(Empcode, EmpName);

			if (oldVal!=null) {
				System.out.println("Student Id Number:" + Empcode + " is "
						+ oldVal + " and has been overwritten by " + EmpName);
			}

			// ask user to check if another entry is required
			System.out.print("Do you want to enter another employee details (y/n)? ");
			String answer = scan.nextLine();

			// condition to satisfy in order to loop again
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (loopAgain);
		scan.close();

		System.out.println("\n**** Displaying only EmpNames as output *****");
		//System.out.println("EmpName");		
		for(int id:mapemployee.keySet()){
			System.out.println(mapemployee.get(id));
		}
		//System.out.println("\n**********************************");
	}

}


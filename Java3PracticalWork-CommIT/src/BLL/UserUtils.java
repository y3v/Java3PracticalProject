package BLL;

import Model.Employee;
import Model.User;

public class UserUtils {
	
	
	public User createTestUser() {
		User temp = new User();
		
		temp.setPassword("admin");
		temp.setUsername("admin");
		
		return temp;
	}
	
	public static Employee createEmployee(String username, String password, String firstname, String lastname, String email) {
		//INSERT INTO DB HERE
		Employee emp = new Employee();
		emp.setFirstName(firstname);
		emp.setLastName(lastname);
		emp.setPassword(password);
		emp.setUsername(username);
		emp.setEmail(email);
		
		return emp;
	}
}	

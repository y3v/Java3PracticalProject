package BLL;

import Model.Employee;
import DAL.EmployeeDAO;
import Model.User;

public class UserUtils {
	
	
	public static Employee createTestUser() {
		Employee temp = new Employee();
		
		temp.setPassword("admin");
		temp.setUsername("admin");
		
		return temp;
	}
	
	public static Employee getUserLogin(String username, String password) {
		Employee emp = new Employee();
		
		emp.setUsername(username);
		emp.setPassword(password);
		
		emp = EmployeeDAO.getLogin(emp);
		
		if (emp != null) 
			return emp;
		else
			return null;
	}
	
	public static Employee createEmployee(String username, String password, String firstname, String lastname, String email) {
		Employee emp = new Employee();
		emp.setFirstName(firstname);
		emp.setLastName(lastname);
		emp.setPassword(password);
		emp.setUsername(username);
		emp.setEmail(email);
		
		return EmployeeDAO.insert(emp);
	}
	
	public static Employee updateProfile(Employee employee){
		return EmployeeDAO.update(employee);
	}
}	

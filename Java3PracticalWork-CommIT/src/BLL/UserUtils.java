package BLL;

import Model.Employee;
import Model.User;

public class UserUtils {
	
	
	public static Employee createTestUser() {
		Employee temp = new Employee();
		
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
	
	public static void fillProfile(Employee employee, String city, String province, String phone, String postalCode, String address){
		if (city != null) {
			employee.setCity(city);
		}
		if (province != null) {
			employee.setProvince(province);
		}
		if (phone != null) {
			employee.setPhoneNumber(phone);
		}
		if (postalCode != null) {
			employee.setPostalCode(postalCode);
		}
		if (address != null) {
			employee.setAddress(address);
		}
	}
}	

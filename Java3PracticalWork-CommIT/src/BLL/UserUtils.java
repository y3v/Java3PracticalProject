package BLL;

import Model.User;

public class UserUtils {
	
	
	public User createTestUser() {
		User temp = new User();
		
		temp.setPassword("admin");
		temp.setUsername("admin");
		
		return temp;
	}
}	

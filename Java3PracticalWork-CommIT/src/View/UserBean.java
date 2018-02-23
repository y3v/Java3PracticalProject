package View;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import BLL.UserUtils;
import Model.User;

@ManagedBean
@SessionScoped

public class UserBean {
	
	private String username;
	private String password;
	private User user;
	protected UserUtils userUtils = new UserUtils();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}

	public String validateLogin() {
		user = userUtils.createTestUser();
		String ret;
		
		if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
			ret = "next";
		}
		else {
			ret = null;
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage("login-form:usernameInput", new FacesMessage("Invalid Username or Password"));
	        /*FacesMessage msg = new FacesMessage("Invalid Login");
	        context.addMessage(((UIInput)component)., msg);*/
	        
		}
		return ret;
	}
	
}

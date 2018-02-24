package View;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name="register")
@ViewScoped

public class RegistrationBean {
	
	private String username;
	private String password = "";
	private String password2 = "";
	private String firstname;
	private String lastname;
	private String email;
	
	public void checkUsernameExists(FacesContext context, UIComponent validate, Object value){
	    String username = (String)value;
	    
	    //THIS IS WHERE WE RETRIEVE LIST OF USERNAMES TO SEE IF USERNAME ALREADY EXISTS

	    if(username.equals("admin")){
	        ((UIInput)validate).setValid(false);
	        FacesMessage msg = new FacesMessage("Username already exists");
	        context.addMessage(validate.getClientId(context), msg);
	    } else if (username.length() < 3) {
	    	if(username.equals("admin")){
		        ((UIInput)validate).setValid(false);
		        FacesMessage msg = new FacesMessage("Username must be at least 3 characters long");
		        context.addMessage(validate.getClientId(context), msg);
		    }
	    }
	}
	
	public void validateEmail(FacesContext context, UIComponent validate, Object value){
	    String email = (String)value;
	    String pattern = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

	    if(!email.matches(pattern)){
	        ((UIInput)validate).setValid(false);
	        FacesMessage msg = new FacesMessage("Please enter a valid email");
	        context.addMessage(validate.getClientId(context), msg);
	    }
	}
	
	public void checkPasswordMatch(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		System.out.println("---------START-----------");
		System.out.println(password);
		password2 = (String)value;
		System.out.println(password2);
		if (!password.equals("") && !password.equals(password2)) {
			System.out.println("Should be adding a warning here");
			context.addMessage("registration-form:password2Input", new FacesMessage("The Passwords do not match"));
		}
		else {
			
		}
		password = password2;
		System.out.println("--------AFTER COMPARING------------");
		System.out.println(password);
		System.out.println(password2);
		System.out.println("--------END------------");
	}

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

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

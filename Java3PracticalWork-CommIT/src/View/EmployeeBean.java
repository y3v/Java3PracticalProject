package View;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import BLL.UserUtils;
import DAL.EmployeeDAO;
import Model.Employee;

@ManagedBean(name="employee")
@SessionScoped

public class EmployeeBean {
	
	//registration values
	private String username;
	private String password = "";
	private String password2 = "";
	private String firstname;
	private String lastname;
	private String email;
	
	//profile values -- optional
	private String address;
	private String city;
	private String province;
	private String phone;
	private String postalCode;
	private Employee employee;
	private boolean profileExists = false; //NEW PROPERTY -- set this to true if the profile exists
	
	public String validateLogin() {
		employee = UserUtils.getUserLogin(username, password);
		
		if (employee != null) {
			System.out.println("employeeOptions");
			return "employeeOptions";
		}
		else {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage("login-form:usernameInput", new FacesMessage("Invalid Username or Password"));
			return null;
		}
	}
	
	public void checkUsernameExists(FacesContext context, UIComponent validate, Object value){
	    String username = (String)value;
	    
	    if(EmployeeDAO.getByUsername(username) != null){
	        ((UIInput)validate).setValid(false);
	        FacesMessage msg = new FacesMessage("Username already exists");
	        context.addMessage(validate.getClientId(context), msg);
	    } else if (username.length() < 3) {
	    	System.out.println("username too short!");
	        ((UIInput)validate).setValid(false);
	        FacesMessage msg = new FacesMessage("Username must be at least 3 characters long");
	        context.addMessage(validate.getClientId(context), msg);
	    }
	}
	
	public void validateEmail(FacesContext context, UIComponent validate, Object value){
		//Validation for email regular expression
	    String email = (String)value;
	    String pattern = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";

	    if(!email.matches(pattern)){
	        ((UIInput)validate).setValid(false);
	        FacesMessage msg = new FacesMessage("Please enter a valid email");
	        context.addMessage(validate.getClientId(context), msg);
	    }
	}
	
	public void checkPasswordMatch(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		//To check if either of the password fields do not match the other
		System.out.println("---------START-----------");
		System.out.println(password);
		password2 = (String)value;
		System.out.println(password2);
		if (!password.equals("") && !password.equals(password2)) {
			System.out.println("Should be adding a warning here");
			context.addMessage("registration-form:password2Input", new FacesMessage("The Passwords do not match"));
		}
		password = password2;
		System.out.println("--------AFTER COMPARING------------");
		System.out.println(password);
		System.out.println(password2);
		System.out.println("--------END------------");
	}
	
	public String registerNav() {
		//Create initial registration
		employee = UserUtils.createEmployee(username, password, firstname, lastname, email);
		System.out.println("Username:" + employee.getUsername());
		System.out.println("Email:" + employee.getEmail());
		System.out.println("Password:" + employee.getPassword());
		System.out.println("Last name:" + employee.getLastName());
		System.out.println("First Name:" + employee.getFirstName());
		
		return ("employeeOptions");
	}
	
	public String createProfile() {
		employee = UserUtils.fillProfile(employee, city, province, phone, postalCode, address);
		
		return ("employeeOptions");
	}
	
	public String doesProfileExist() { //NEW METHOD
		if (address == null || address == null || address == null ||address == null || address == null) {
			System.out.println("Go to: createProfile");
			return "createProfile";
		}
		else {
			System.out.println("Go to: viewProfile");
			return "createProfile";
		}
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

	public Employee getEmployee() {
		return employee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode.toUpperCase();
	}

	public boolean isProfileExists() {
		return profileExists;
	}

	public void setProfileExists(boolean profileExists) {
		this.profileExists = profileExists;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}

package View;

import javax.faces.bean.ManagedBean;

import DAL.EmployeeDAO;
import Model.Employee;

import org.apache.ibatis.io.*;

@ManagedBean(name="dbbean")

public class DbTestBean {
	private EmployeeDAO dao = new EmployeeDAO();
	private Employee emp = new Employee();
	
	public DbTestBean() {
		emp.setAddress("");
		emp.setCity("");
		emp.setPhoneNumber("");
	}
	
	public String toDb() {
		
		return "index";
	}
	
	public String rettt() {
		dao.insert(emp);
		
		return "next";
	}
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}

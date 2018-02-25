package View;

import java.util.List;

import javax.faces.bean.ManagedBean;

import DAL.EducationDAO;
import DAL.EmployeeDAO;
import DAL.ExperienceDAO;
import Model.Education;
import Model.Employee;
import Model.Experience;

import org.apache.ibatis.io.*;

@ManagedBean(name="dbbean")

public class DbTestBean {
	private EducationDAO eduDao = new EducationDAO();
	private Education edu = new Education();
	
	private ExperienceDAO expDao = new ExperienceDAO();
	private List<Experience> experiences = expDao.getAllExperiencesForEmployeeId(1);
	
	private EmployeeDAO dao = new EmployeeDAO();
	private Employee emp = new Employee();
	// private Employee emp = dao.getById(1);
	
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

	public Education getEdu() {
		return edu;
	}

	public void setEdu(Education edu) {
		this.edu = edu;
	}

	public List<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}
	
	
}

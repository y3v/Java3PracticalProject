package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Education {
	private int id;
	private int employeeId;
	private String degreeName;
	private String designation;
	private String schoolName;
	private Date startDate;
	private Date endDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getStartDate() {
		return new SimpleDateFormat("MMM dd,yyyy").format(startDate);
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return new SimpleDateFormat("MMM dd,yyyy").format(endDate);
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}

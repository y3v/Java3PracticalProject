package View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import BLL.ResumeUtils;
import Model.Education;

@ManagedBean(name="resume")
@SessionScoped

public class ResumeBean {
	private List<Education> education = new ArrayList<Education>();
	private String designation;
	private String degreeName;
	private String schoolName;
	private Date startDate;
	private Date endDate;
	
	public String addEducation() {
		education.add(ResumeUtils.addEducation(designation, schoolName, degreeName, startDate, endDate));
		
		return null; //I want it to stay on the same page
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}

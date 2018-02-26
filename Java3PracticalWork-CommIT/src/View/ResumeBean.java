package View;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import BLL.ResumeUtils;

@ManagedBean(name="resume", eager=true)


public class ResumeBean {
	
	@ManagedProperty(value="#{lists}")
	private ResumeListBean lists; //to access the bean where all the lists are stored for entire session
	
	//Education Section
	private String designation;
	private String degreeName;
	private String schoolName;
	private Date startDate;
	private Date endDate;
	
	//Experience Section
	private String company;
	private String title;
	private String description;
	private Date startDateExp;
	private Date endDateExp;
	private String location;
	
	//Programming languages
	private String progLanguage;
	
	public String addEducation() {
		lists.getEducation().add(ResumeUtils.addEducation(designation, schoolName, degreeName, startDate, endDate));
		
		return "createResume"; //I want it to stay on the same page
	}
	
	public String addExperience() {
		lists.getExperience().add(ResumeUtils.addExperience(title, description, company, location, startDateExp, endDateExp));
		return "createResume";
	}
	
	public void addLanguage() {
		lists.getProgLanguages().add(ResumeUtils.addProgLanguage(progLanguage));
		progLanguage = "";
	}
	
	
	
	//GETTERS AND SETTERS

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


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDateExp() {
		return startDateExp;
	}

	public void setStartDateExp(Date startDateExp) {
		this.startDateExp = startDateExp;
	}

	public Date getEndDateExp() {
		return endDateExp;
	}

	public void setEndDateExp(Date endDateExp) {
		this.endDateExp = endDateExp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ResumeListBean getLists() {
		return lists;
	}

	public void setLists(ResumeListBean lists) {
		this.lists = lists;
	}

	public String getProgLanguage() {
		return progLanguage;
	}

	public void setProgLanguage(String progLanguage) {
		this.progLanguage = progLanguage;
	}
	
}

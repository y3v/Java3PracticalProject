package Model;

import java.util.Date;

public class JobPosting {
	private int id;
	private int employer_id;
	private String jobTitle;
	private String jobDescription;
	private int yearsOfExperience;
	private Date startDate;
	private Date endDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public int getYearsOfExperienceRequired() {
		return yearsOfExperience;
	}
	public void setYearsOfExperienceRequired(int yearsOfExperienceRequired) {
		this.yearsOfExperience = yearsOfExperienceRequired;
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

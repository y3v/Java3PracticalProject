package View;

import java.util.Date;
import java.util.Iterator;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import BLL.ResumeUtils;
import Model.Language;
import Model.ProgrammingLanguage;

@ManagedBean(name="resume")
@ViewScoped

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
	
	//Languages spoken
	private String language;
	
	public String addEducation() {
		lists.getEducation().add(ResumeUtils.addEducation(designation, schoolName, degreeName, startDate, endDate));
		
		return "createResume"; //I want it to stay on the same page
	}
	
	public String addExperience() {
		lists.getExperience().add(ResumeUtils.addExperience(title, description, company, location, startDateExp, endDateExp));
		return "createResume";
	}
	
	public void addLanguage() {
		if (progLanguage!=null) {		
			lists.getProgLanguages().add(ResumeUtils.addProgLanguage(progLanguage));
			progLanguage=null;
			/*for (ProgrammingLanguage lang : lists.getProgLanguages()) {
				System.out.println(lang.getProgrammingLanguage());
			}*/
		}
	}
	
	public void addLanguageSpoken() {
		if (language!=null) {		
			lists.getLanguages().add(ResumeUtils.addLanguage(language));
			language=null;
		}
	}
	
	public void removeLanguage(String language) {
		System.out.println("The passed argument is: " + language);
		Iterator<ProgrammingLanguage> iter = lists.getProgLanguages().iterator();

		while (iter.hasNext()) {
			ProgrammingLanguage str = iter.next();

		    if (str.getProgrammingLanguage().equals(language))
		        iter.remove();
		}
	}
	
	public void removeLanguageSpoken(String language) {
		System.out.println("The passed argument is: " + language);
		Iterator<Language> iter = lists.getLanguages().iterator();

		while (iter.hasNext()) {
			Language str = iter.next();

		    if (str.getLanguageName().equals(language))
		        iter.remove();
		}
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}

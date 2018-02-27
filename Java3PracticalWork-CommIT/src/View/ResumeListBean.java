package View;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Model.Education;
import Model.Employee;
import Model.Experience;
import Model.Language;
import Model.ProgrammingLanguage;
import BLL.ResumeUtils;

@ManagedBean(name="lists", eager=true)
@SessionScoped

public class ResumeListBean {
	private List<Education> education = new ArrayList<Education>();	
	private List<Experience> experience = new ArrayList<Experience>();	
	private List<ProgrammingLanguage> progLanguages = new ArrayList<ProgrammingLanguage>();
	private List<Language> languages = new ArrayList<Language>();

	public ResumeListBean() {
		EmployeeBean empbean = (EmployeeBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("employee");
		Employee emp = empbean.getEmployee();
		
		education = ResumeUtils.getEducations(emp);
		experience = ResumeUtils.getExperiences(emp);
		progLanguages = ResumeUtils.getProgrammingLanguages(emp);
		languages = ResumeUtils.getLanguages(emp);
	}
	
	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<ProgrammingLanguage> getProgLanguages() {
		return progLanguages;
	}

	public void setProgLanguages(List<ProgrammingLanguage> progLanguages) {
		this.progLanguages = progLanguages;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	
	
	
	
}

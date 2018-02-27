package View;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Model.Education;
import Model.Experience;
import Model.Language;
import Model.ProgrammingLanguage;

@ManagedBean(name="lists")
@SessionScoped

public class ResumeListBean {
	private List<Education> education = new ArrayList<Education>();	
	private List<Experience> experience = new ArrayList<Experience>();	
	private List<ProgrammingLanguage> progLanguages = new ArrayList<ProgrammingLanguage>();
	private List<Language> languages = new ArrayList<Language>();

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

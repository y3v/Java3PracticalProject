package BLL;

import java.util.Date;

import Model.Education;
import Model.Experience;
import Model.Language;
import Model.ProgrammingLanguage;

public class ResumeUtils {
	
	public static Education addEducation(String designation, String schoolName, String degreeName, Date startDate, Date endDate) {
		
		//Going to create an Education object which will be added to an ArrayList<Education>
		
		//TO DO: INSERT INTO DB!
		
		Education edu = new Education();
		
		edu.setDegreeName(degreeName);
		edu.setDesignation(designation);
		edu.setEndDate(endDate);
		edu.setSchoolName(schoolName);
		edu.setStartDate(startDate);
		
		return edu;
	}
	
	public static Experience addExperience(String title, String description, String company, String location, Date startDateExp, Date endDateExp) {
		
		//Going to create an Experience object which will be added to an ArrayList<Experience>
		
		//TO DO: INSERT INTO DB!
		
		Experience exp = new Experience();
		
		exp.setCompany(company);
		exp.setDescription(description);
		exp.setEndDate(endDateExp);
		exp.setStartDate(startDateExp);
		exp.setLocation(location);
		exp.setTitle(title);
		
		return exp;
	}
	
	public static ProgrammingLanguage addProgLanguage(String progLanguage) {
		ProgrammingLanguage lang = new ProgrammingLanguage();
		lang.setProgrammingLanguage(progLanguage);
		
		return lang;
	}
	
	public static Language addLanguage(String languageName) {
		Language lang = new Language();
		lang.setLanguageName(languageName);
		
		return lang;
	}
	
}

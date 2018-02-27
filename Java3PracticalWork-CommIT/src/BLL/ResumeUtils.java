package BLL;

import java.util.Date;
import java.util.List;

import DAL.EducationDAO;
import DAL.ExperienceDAO;
import DAL.LanguageDAO;
import DAL.ProgrammingLanguageDAO;
import Model.ActionsDoubleId;
import Model.Education;
import Model.Employee;
import Model.Experience;
import Model.Language;
import Model.ProgrammingLanguage;

public class ResumeUtils {
	
	public static Education addEducation(Employee emp, String designation, String schoolName, String degreeName, Date startDate, Date endDate) {
		
		//Going to create an Education object which will be added to an ArrayList<Education>
		
		Education edu = new Education();
		
		edu.setDegreeName(degreeName);
		edu.setDesignation(designation);
		edu.setEndDate(endDate);
		edu.setSchoolName(schoolName);
		edu.setStartDate(startDate);
		edu.setEmployeeId(emp.getId());
		
		return EducationDAO.insert(edu);
	}
	
	public static List<Education> getEducations(Employee emp){
		return EducationDAO.getByEmployeeId(emp.getId());
	}
	
	public static List<Experience> getExperiences(Employee emp){
		return ExperienceDAO.getAllExperiencesForEmployeeId(emp.getId());
	}
	
	public static List<Language> getLanguages(Employee emp){
		return LanguageDAO.getByEmployeeId(emp.getId());
	}
	
	public static List<ProgrammingLanguage> getProgrammingLanguages(Employee emp){
		return ProgrammingLanguageDAO.selectAllByEmployeeId(emp.getId());
	}
	
	
	public static Experience addExperience(Employee emp, String title, String description, String company, String location, Date startDateExp, Date endDateExp) {
		
		//Going to create an Experience object which will be added to an ArrayList<Experience>
		
		Experience exp = new Experience();
		exp.setEmployeeId(emp.getId());
		exp.setCompany(company);
		exp.setDescription(description);
		exp.setEndDate(endDateExp);
		exp.setStartDate(startDateExp);
		exp.setLocation(location);
		exp.setTitle(title);
		
		return ExperienceDAO.insert(exp);
	}
	
	public static ProgrammingLanguage addProgLanguage(int empId, String progLanguage) {
		
		ProgrammingLanguage lang = ProgrammingLanguageDAO.getByLanguageName(progLanguage);
		
		if (lang == null) {
			
			lang = new ProgrammingLanguage();
			lang.setProgrammingLanguage(progLanguage);
			lang = ProgrammingLanguageDAO.insert(lang);
		}
		
		ActionsDoubleId idid = new ActionsDoubleId();
		idid.setId1(empId);
		idid.setId2(lang.getId());
		
		ProgrammingLanguageDAO.insertRelationship(idid);
		
		return lang;
	}
	
	public static void deleteProgLanguage(int empId, int progLangId) {
		ActionsDoubleId idid = new ActionsDoubleId();
		idid.setId1(empId);
		idid.setId2(progLangId);
		
		ProgrammingLanguageDAO.delete(idid);
	}
	

	public static Language addLanguage(int empId, String languageName) {
		
		Language lang = LanguageDAO.getByLanguageName(languageName);
		
		if (lang == null) {
			lang = new Language();
			lang.setIsoCode(languageName.substring(0, 3).toLowerCase());
			lang.setLanguageName(languageName);
			
			LanguageDAO.insert(lang);
		}
		
		ActionsDoubleId idid = new ActionsDoubleId();
		idid.setId1(empId);
		idid.setId2(lang.getIsoCode());
		
		LanguageDAO.insertRelationShip(idid);
		
		return lang;
	}
	
	public static void deleteLanguage(int empId, Language language) {
		ActionsDoubleId idid = new ActionsDoubleId();
		idid.setId1(empId);
		idid.setId2(language.getIsoCode());
		
		LanguageDAO.deleteRelationship(idid);
	}
}

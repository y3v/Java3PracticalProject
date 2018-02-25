package BLL;

import java.util.Date;

import Model.Education;

public class ResumeUtils {
	
	public static Education addEducation(String designation, String schoolName, String degreeName, Date startDate, Date endDate) {
		Education edu = new Education();
		
		edu.setDegreeName(degreeName);
		edu.setDesignation(designation);
		edu.setEndDate(endDate);
		edu.setSchoolName(schoolName);
		edu.setStartDate(startDate);
		
		return edu;
	}
	
}

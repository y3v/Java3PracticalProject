package BLL;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name= AutoCompleteSchools.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class AutoCompleteSchools
{

	public static final String BEAN_NAME = "autoCompleteSchools";
    public String getBeanName() { return BEAN_NAME; }

    
    public List<SelectItem> schools = new ArrayList<SelectItem>();

    public List<SelectItem> getSchools(){
        return schools;
    }
    
    public AutoCompleteSchools() {
    	schools.add(new SelectItem("Athabaska University"));
    	schools.add(new SelectItem("McGill University"));
    	schools.add(new SelectItem("York University"));
    	schools.add(new SelectItem("Universitie de Montreal"));
    	schools.add(new SelectItem("UQAM"));
    	schools.add(new SelectItem("Institut superier d'informatique"));
    	schools.add(new SelectItem("University of Toronto"));
    	schools.add(new SelectItem("Ryerson University"));
    	schools.add(new SelectItem("University of Western Ontario"));
    	schools.add(new SelectItem("Queen's University"));
    	schools.add(new SelectItem("Seneca College"));
    	schools.add(new SelectItem("Dawson College"));
    	schools.add(new SelectItem("College LaSalle"));
    	schools.add(new SelectItem("Concordia Univerity"));
    	schools.add(new SelectItem("Simon Fraser University"));
    	schools.add(new SelectItem("University of Alberta"));
    	schools.add(new SelectItem("University of Saskatchewan"));
    	schools.add(new SelectItem("Harvard"));
    	schools.add(new SelectItem("Yale"));
    	schools.add(new SelectItem("Cornell"));
    	schools.add(new SelectItem("Dartmouth"));
    	schools.add(new SelectItem("Dalhousie University"));
    	schools.add(new SelectItem("Stanford"));
    	schools.add(new SelectItem("UCLA"));
    }

}
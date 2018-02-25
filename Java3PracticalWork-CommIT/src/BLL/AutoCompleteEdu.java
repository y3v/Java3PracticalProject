package BLL;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name= AutoCompleteEdu.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class AutoCompleteEdu
{

	public static final String BEAN_NAME = "autoCompleteEdu";
    public String getBeanName() { return BEAN_NAME; }

    
    public List<SelectItem> edu = new ArrayList<SelectItem>();

    public List<SelectItem> getEdu(){
        return edu;
    }
    
    public AutoCompleteEdu() {
    	edu.add(new SelectItem("BA"));
    	edu.add(new SelectItem("BAcc"));
    	edu.add(new SelectItem("BAdmin"));
    	edu.add(new SelectItem("BAS"));
    	edu.add(new SelectItem("BAA"));
    	edu.add(new SelectItem("BASc"));
    	edu.add(new SelectItem("BEd"));
    	edu.add(new SelectItem("BComm"));
    	edu.add(new SelectItem("BA/LLB"));
    	edu.add(new SelectItem("BA/MA"));
    	edu.add(new SelectItem("BBA"));
    	edu.add(new SelectItem("IBBA"));
    	edu.add(new SelectItem("BMath"));
    	edu.add(new SelectItem("BBE"));
    	edu.add(new SelectItem("BComm"));
    	edu.add(new SelectItem("BSc"));
    	edu.add(new SelectItem("BCS"));
    	edu.add(new SelectItem("MA"));
    	edu.add(new SelectItem("MSc"));
    	edu.add(new SelectItem("MBA"));
    	edu.add(new SelectItem("LLM"));
    	edu.add(new SelectItem("MPhil"));
    	edu.add(new SelectItem("PHD"));
    	edu.add(new SelectItem("MD"));
    }

}
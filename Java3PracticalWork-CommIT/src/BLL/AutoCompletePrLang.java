package BLL;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name= AutoCompletePrLang.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class AutoCompletePrLang
{

	public static final String BEAN_NAME = "autoCompletePrLang";
    public String getBeanName() { return BEAN_NAME; }

    
    public List<SelectItem> languages = new ArrayList<SelectItem>();

    public List<SelectItem> getLanguages(){
        return languages;
    }
    
    public AutoCompletePrLang() {
    	languages.add(new SelectItem("C++"));
    	languages.add(new SelectItem("C"));
    	languages.add(new SelectItem("C#"));
    	languages.add(new SelectItem("F#"));
    	languages.add(new SelectItem("Java"));
    	languages.add(new SelectItem("JavaScript"));
    	languages.add(new SelectItem("SQL"));
    	languages.add(new SelectItem("HTML"));
    	languages.add(new SelectItem("CSS"));
    	languages.add(new SelectItem("TypeScript"));
    	languages.add(new SelectItem("Angular"));
    	languages.add(new SelectItem("R"));
    	languages.add(new SelectItem("Ruby"));
    	languages.add(new SelectItem("Python"));
    	languages.add(new SelectItem("PHP"));
    	languages.add(new SelectItem("Perl"));
    	languages.add(new SelectItem("Objective-C"));
    	languages.add(new SelectItem("Go"));
    	languages.add(new SelectItem("Swift"));
    	languages.add(new SelectItem("VB.Net"));
    	languages.add(new SelectItem("Bash"));
    	languages.add(new SelectItem("Haskell"));
    	languages.add(new SelectItem("Scala"));
    }

}
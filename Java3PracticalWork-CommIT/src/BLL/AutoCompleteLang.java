package BLL;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name= AutoCompleteLang.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class AutoCompleteLang
{

	public static final String BEAN_NAME = "autoCompleteLang";
    public String getBeanName() { return BEAN_NAME; }

    
    public List<SelectItem> languages = new ArrayList<SelectItem>();

    public List<SelectItem> getLanguages(){
        return languages;
    }
    
    public AutoCompleteLang() {
    	languages.add(new SelectItem("English"));
    	languages.add(new SelectItem("French"));
    	languages.add(new SelectItem("Spanish"));
    	languages.add(new SelectItem("Russian"));
    	languages.add(new SelectItem("German"));
    	languages.add(new SelectItem("Hebrew"));
    	languages.add(new SelectItem("Arabic"));
    	languages.add(new SelectItem("Georgian"));
    	languages.add(new SelectItem("Portuguese"));
    	languages.add(new SelectItem("Dutch"));
    	languages.add(new SelectItem("Polish"));
    	languages.add(new SelectItem("Ukrainian"));
    	languages.add(new SelectItem("Swedish"));
    	languages.add(new SelectItem("Danish"));
    	languages.add(new SelectItem("Norweigian"));
    	languages.add(new SelectItem("Finnish"));
    	languages.add(new SelectItem("Estonian"));
    	languages.add(new SelectItem("Mandarin"));
    	languages.add(new SelectItem("Cantonese"));
    	languages.add(new SelectItem("Japanese"));
    	languages.add(new SelectItem("Korean"));
    	languages.add(new SelectItem("Thai"));
    	languages.add(new SelectItem("Gujarati"));
    	languages.add(new SelectItem("Punjabi"));
    	languages.add(new SelectItem("Vietnamese"));
    	languages.add(new SelectItem("Urdu"));
    	languages.add(new SelectItem("Gaelic"));
    	languages.add(new SelectItem("Welsh"));
    	languages.add(new SelectItem("Latvian"));
    	languages.add(new SelectItem("Lithuanian"));
    	languages.add(new SelectItem("Kazakh"));
    	languages.add(new SelectItem("Italian"));
    	languages.add(new SelectItem("Greek"));
    	languages.add(new SelectItem("Turkish"));
    	languages.add(new SelectItem("Swahili"));
    	languages.add(new SelectItem("Yoruba"));
    	languages.add(new SelectItem("Zulu"));
    	languages.add(new SelectItem("Shona"));
    	languages.add(new SelectItem("Hausa"));
    	languages.add(new SelectItem("Amharic"));
    	languages.add(new SelectItem("Igbo"));
    	languages.add(new SelectItem("Armenian"));
    	languages.add(new SelectItem("Romanian"));
    	languages.add(new SelectItem("Bulgarian"));
    	languages.add(new SelectItem("Serbian"));
    	languages.add(new SelectItem("Croatian"));
    	languages.add(new SelectItem("Slovakian"));
    	languages.add(new SelectItem("Czech"));
    	languages.add(new SelectItem("Slovenian"));
    	languages.add(new SelectItem("Icelandic"));
    	
    	
    }

}
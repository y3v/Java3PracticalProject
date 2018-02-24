package BLL;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name= AutoCompleteCities.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class AutoCompleteCities
{

	public static final String BEAN_NAME = "autoCompleteCities";
    public String getBeanName() { return BEAN_NAME; }

    
    public List<SelectItem> cities = new ArrayList<SelectItem>();

    public List<SelectItem> getCities(){
        return cities;
    }
    
    public AutoCompleteCities() {
    	cities.add(new SelectItem("Boucherville"));
    	cities.add(new SelectItem("Calgary"));
    	cities.add(new SelectItem("Edmonton"));
    	cities.add(new SelectItem("Fredericton"));
    	cities.add(new SelectItem("Toronto"));
    	cities.add(new SelectItem("Thornhill"));
    	cities.add(new SelectItem("Kitchener"));
    	cities.add(new SelectItem("Laval"));
    	cities.add(new SelectItem("London"));
    	cities.add(new SelectItem("Longueuil"));
    	cities.add(new SelectItem("Markham"));
    	cities.add(new SelectItem("Moncton"));
    	cities.add(new SelectItem("Montreal"));
    	cities.add(new SelectItem("Richmond Hill"));
    	cities.add(new SelectItem("Regina"));
    	cities.add(new SelectItem("Repentigny"));
    	cities.add(new SelectItem("Saskatoon"));
    	cities.add(new SelectItem("St.John's"));
    	cities.add(new SelectItem("Quebec City"));
    	cities.add(new SelectItem("Vancouver"));
    	cities.add(new SelectItem("Victoria"));
    	cities.add(new SelectItem("Whitehorse"));
    	cities.add(new SelectItem("Winnipeg"));
    }

}
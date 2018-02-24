package View;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name="options")

public class ProfileOptions {
	private List<SelectItem> provinces = new ArrayList<SelectItem>();
	
	public ProfileOptions() {
		populateProvinces();
	}
	
	public void populateProvinces() {
		provinces.add(new SelectItem("Alberta"));
		provinces.add(new SelectItem("British Columbia"));
		provinces.add(new SelectItem("Manitoba"));
		provinces.add(new SelectItem("New Brunswick"));
		provinces.add(new SelectItem("Newfoundland and Labrador"));
		provinces.add(new SelectItem("Nova Scotia"));
		provinces.add(new SelectItem("Ontario"));
		provinces.add(new SelectItem("Prince Edward Island"));
		provinces.add(new SelectItem("Quebec"));
		provinces.add(new SelectItem("Saskatchewan"));
		provinces.add(new SelectItem("Northwest Territories"));
		provinces.add(new SelectItem("Nunavut"));
		provinces.add(new SelectItem("Yukon Territories"));
	}

	public List<SelectItem> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<SelectItem> provinces) {
		this.provinces = provinces;
	}
	
	
}

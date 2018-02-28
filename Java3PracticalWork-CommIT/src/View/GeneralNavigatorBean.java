package View;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="nav")
@SessionScoped

public class GeneralNavigatorBean {
	public String invalidateSession() {
		System.out.println("Destroying Session!");
		/*FacesContext.getCurrentInstance().getExternalContext().invalidateSession();*/
        return "homepage?faces-redirect=true";
	}
	
	public String getAccount() {
		
		return "showEmployeeDetails";
	}
	
}

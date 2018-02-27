package View;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="nav")
@SessionScoped

public class GeneralNavigatorBean {
	public String invalidateSession() {
		//TO DO: put code here to invalidate the session
		return "homepage";
	}
	
	public String getAccount() {
		
		return "accountOptions";
	}
	
}

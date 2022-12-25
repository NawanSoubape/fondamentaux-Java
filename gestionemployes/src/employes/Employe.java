package employes;

import java.time.LocalDate;

public class Employe {
	private String name;
	private String firstname;
	private LocalDate birthday;

	
	public Employe(String name, String firstname, LocalDate birthday) {
		super();
		this.name = name;
		this.firstname = firstname;
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "*****FICHE EMPLOYE*****  \n\n name : " + name + "\n firstname : " + firstname + "\n birthday : " + birthday;
	}

	
}


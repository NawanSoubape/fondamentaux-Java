package employes;

import java.util.Date;

public class EmployeCommission extends Employe{

	private double salaire;

	public EmployeCommission(String name, String firstname, Date birthday,double salaire) {
		super(name, firstname, birthday);
		this.salaire = salaire;
		
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public double claculSalaire(double commission) {
		return this.salaire+this.salaire*0.05;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+ "\n" ;
	}
		

}


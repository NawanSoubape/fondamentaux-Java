package employes;

import java.util.Date;

public class EmployeFixe extends Employe{
	private double salaire;

	public EmployeFixe(String name, String firstname, Date birthday,double salaire) {
		super(name, firstname, birthday);
		this.salaire = salaire;
		
	}
	
	
	
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public double calculSalaire() {
		return this.salaire;
	}

	@Override
	public String toString() {
		return super.toString()+ "\n Votre salire est : "+this.calculSalaire()+"\n";
	}
	

}

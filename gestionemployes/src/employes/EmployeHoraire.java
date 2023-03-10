package employes;

import java.time.LocalDate;


public class EmployeHoraire extends Employe{

		public EmployeHoraire(String name, String firstname, LocalDate birthday) {
		super(name, firstname, birthday);
		
		
	}

	public double calculSalaire(double nombreheure) {
		if(nombreheure<=40) {
			return nombreheure*25;
		}
		return 40*25+(nombreheure-40)*1.5;
		
		}
		

	@Override
	public String toString() {
		return "\n"+super.toString()+"\n";
	}
}

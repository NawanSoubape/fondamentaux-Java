package employes;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {

		Employe employefixe = new EmployeFixe("Aziz", "KAMKAM", LocalDate.now(), 12000.0);
		EmployeHoraire employehoraire = new EmployeHoraire("Soubapé", "NAWAN",LocalDate.now());
		EmployeCommission employecommission = new EmployeCommission("Adil", "Mohamed", LocalDate.now(), 20000);
		System.out.println(employefixe);
		System.out.println(employehoraire+ " Votre salaire est : "+employehoraire.calculSalaire(100));
		System.out.println(employecommission+ " Votre salaire est : "+employecommission.claculSalaire(100));
	}

}

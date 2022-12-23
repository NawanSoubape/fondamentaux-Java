package employes;

import java.util.Date;

public class Test {
	public static void main(String[] args) {

		Employe employefixe = new EmployeFixe("Aziz", "KAMKAM", new Date(), 12000.0);
		EmployeHoraire employehoraire = new EmployeHoraire("Soubapé", "NAWAN",new Date());
		EmployeCommission employecommission = new EmployeCommission("Adil", "Mohamed", new Date(), 20000);
		System.out.println(employefixe);
		System.out.println(employehoraire+ " Votre salaire est : "+employehoraire.calculSalaire(100));
		System.out.println(employecommission+ " Votre salaire est : "+employecommission.claculSalaire(100));
	}

}

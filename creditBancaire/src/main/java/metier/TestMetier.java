package metier;

public class TestMetier {

	public static void main(String[] args) {
		CreditMetierImpl metier = new CreditMetierImpl();
		double capital = 200000;
		double taux = 4.5;
		int duree = 240;
		double mensualite = metier.calculMensualiteCredit(capital, taux, duree);
		System.out.println(mensualite);
		

	}

}

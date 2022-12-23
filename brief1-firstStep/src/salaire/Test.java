package salaire;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Salaire employe1 = new Salaire();
		employe1.message();
		System.out.println("Veuillez choisir une méthode de paiement :  \n"+"1 - Paiement mensuel \n"+"2 - Paiement hebdomadaire \n");
		Scanner scan = new Scanner(System.in);
		String mpaiement = scan.next();
		 int mp = Integer.parseInt(mpaiement);
		switch(mp) {
		case 1 : 
			System.out.println("Calcul du salaire mensuel ");
			System.out.println("Votre salaire mensuel est : "+employe1.salairemensuel()+" DHS");
			break;
		case 2:
			System.out.println("Calcul du salaire hebdomadaire ");
		System.out.println("Votre salaire hebdomadaire est : "+employe1.salairehebdomadaire());
			break;
		default :
			System.out.println(" Il semble que vous n'avez pas choisi une méthode de paiement "+" DHS");
		}
				
		
		
	}

}

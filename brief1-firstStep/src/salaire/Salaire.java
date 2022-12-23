package salaire;

import java.util.Scanner;

public class Salaire {
	private String name;
	private double nombre_heure;
	private double tx_horaire;
	private double salaire =0;
	
	public Salaire() {
		
	}
	
public Salaire(String name, double nombre_heure,double tx_horaire, double salaire) {
	this.name = name;
	this.nombre_heure = nombre_heure;
	this.tx_horaire = tx_horaire;
	this.salaire = salaire;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getNombre_heure() {
	return nombre_heure;
}

public void setNombre_heure(double nombre_heure) {
	this.nombre_heure = nombre_heure;
}

public double getTx_horaire() {
	return tx_horaire;
}

public void setTx_horaire(double tx_horaire) {
	this.tx_horaire = tx_horaire;
}
public double getSalaire() {
	return salaire;
}
public String toString() {
	return ("FICHE SYNTHESE DE "+this.name+"\n"+"Nombre d'heure : "+this.nombre_heure
			+"\n"+"Salaire : "+this.salaire);
}

public void message() {
	System.out.println("Entrez votre nom : ");
	Scanner scan = new Scanner(System.in);
	 String nom = scan.next();
	 System.out.println("Bienvenue "+nom +"!");
}

public double salairehebdomadaire() {
	System.out.println("Donnez le nombre d'heure travaillé par semaine <= 40 : ");
	Scanner nheure= new Scanner(System.in);
	String sc1 = nheure.next();
	
	System.out.println("Donnez le taux horaire >= 25 "+"DHS" +" : ");
	Scanner thoraire= new Scanner(System.in);
	String sc2 = thoraire.next();

	double nbreheure = Double.parseDouble(sc1);
	double thoraire1 = Double.parseDouble(sc2);
	if(nbreheure <=40 & thoraire1>=25) {
	salaire = salaire+nbreheure*thoraire1;
		}
	else if(nbreheure >40 & nbreheure<=50) {
	double salaire1 = salaire+40*thoraire1;
	salaire = salaire1+(50-nbreheure)*1.5;
		}	
	nheure.close();
	thoraire.close();
	return salaire;
	}
	


public double salairemensuel() {
	System.out.println("Donnez le nombre d'heure travaillé par mois <= 200 : ");
	Scanner nheure= new Scanner(System.in);
	String sc1 = nheure.next();
	
	System.out.println("Donnez le taux horaire  >= 20 "+"DHS" +" : ");
	Scanner thoraire= new Scanner(System.in);
	String sc2 = thoraire.next();

	double nbreheure = Double.parseDouble(sc1);
	double thoraire1 = Double.parseDouble(sc2);
	if(nbreheure<=180 & thoraire1>=20) {
	salaire = salaire+nbreheure*thoraire1;
		}
	else if(nbreheure >180 & nbreheure<=200) {
	double salaire1 = salaire+180*thoraire1;
	salaire = salaire1+(200-nbreheure)*1.5;
		}	
	nheure.close();
	thoraire.close();
	return salaire;
}
}

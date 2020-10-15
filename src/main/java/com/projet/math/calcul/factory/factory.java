package com.projet.math.calcul.factory;

import java.util.Scanner;

import com.projet.math.calcul.App;
import com.projet.math.calcul.label.Affichage;
import com.projet.math.calcul.operation.Calcul;

public class factory {
	
	static String[] operateurfacile = {"+", "-"};
public static void retourMenu (char choixRetourMenu, Scanner choixMain) {
		
		choixRetourMenu = choixMain.next().charAt(choixRetourMenu);
		if (choixRetourMenu == 'o' || choixRetourMenu == 'O' )
		{
			System.out.println("Retour vers le menu");
			App.main(null);
		}
		else if (choixRetourMenu == 'n' || choixRetourMenu == 'N' )
		{
			System.out.println("Aurevoir");
			System.exit(0);
		}
	}
	
	@SuppressWarnings("resource")
	public static void surfaceTriangle (char choixRetourMenu, Scanner choixMain) {
		System.out.println("----- Surface d'un triangle -----");
		Scanner base = new Scanner(System.in);
		Scanner hauteur = new Scanner(System.in);
		double baseInt;
		double hauteurInt;
		double surfaceTriangle;

		System.out.println("Valeur de la base : ");
		baseInt = base.nextDouble();
		System.out.println("Valeur de la hauteur : ");
		hauteurInt = hauteur.nextDouble();
		surfaceTriangle = Calcul.CalculSurfaceTriangle(baseInt, hauteurInt);
		System.out.println("La surface est de : " + surfaceTriangle);
		System.out.println("\nRetour vers le menu principal ? (o/n)");
		//Choix retour menu
		retourMenu(choixRetourMenu, choixMain);
	}
	
	@SuppressWarnings("resource")
	public static void surfaceRectangle (char choixRetourMenu, Scanner choixMain) {
		System.out.println("----- Surface d'un rectangle -----");
		Scanner longueur = new Scanner(System.in);
		Scanner largeur = new Scanner(System.in);
		double longueurInt;
		double largeurInt;
		double surfaceRectangle;

		System.out.println("Valeur de la largeur : ");
		largeurInt = largeur.nextDouble();
		System.out.println("Valeur de la longeur : ");
		longueurInt = longueur.nextDouble();
		surfaceRectangle = Calcul.CalculSurfaceRectangle(longueurInt, largeurInt);
		System.out.println("La surface est de : " + surfaceRectangle);
		System.out.println("\nRetour vers le menu principal ? (o/n)");
		//Choix retour menu
		retourMenu(choixRetourMenu, choixMain);
	}
	
	@SuppressWarnings("resource")
	public static void surfaceCarre (char choixRetourMenu, Scanner choixMain) {
		System.out.println("----- Surface d'un carré -----");
		Scanner cote = new Scanner(System.in);
		double coteInt;
		double surfaceCarre;

		System.out.println("Valeur d'un cote : ");
		coteInt = cote.nextDouble();
		surfaceCarre = Calcul.CalculSurfaceCarre(coteInt);
		System.out.println("La surface est de : " + surfaceCarre);
		System.out.println("\nRetour vers le menu principal ? (o/n)");
		//Choix retour menu
		retourMenu(choixRetourMenu, choixMain);
	}
	
	@SuppressWarnings("resource")
	public static void surfaceCercle (char choixRetourMenu, Scanner choixMain){
		System.out.println("----- Surface d'un cercle -----");
		Scanner rayon = new Scanner(System.in);
		
		double rayonInt;
		double surfaceCercle;

		System.out.println("Valeur du rayon : ");
		rayonInt = rayon.nextDouble();
		surfaceCercle = Calcul.CalculSurfaceCercle(rayonInt);
		System.out.println("La surface est de : " + surfaceCercle);
		System.out.println("\nRetour vers le menu principal ? (o/n)");
		//Choix retour menu
		retourMenu(choixRetourMenu, choixMain);
	}
	
	@SuppressWarnings("resource")
	public static void hypothenuse () {
		System.out.println("----- Cacul de l'hypothenuse -----");
		Scanner longueur = new Scanner(System.in);
		Scanner largeur = new Scanner(System.in);
		double longueurInt;
		double largeurInt;
		double Hypo;
		
		
		System.out.println("Valeur de la longueur : ");
		longueurInt = longueur.nextDouble();
		System.out.println("Valeur de la largeur : ");
		largeurInt = largeur.nextDouble();
		Hypo = Calcul.CalculHypo(longueurInt, largeurInt);
		System.out.println("L'hypothenuse est de : " + Hypo);
		System.out.println("\nRetour vers le menu principal ? (o/n)");
		
		//Choix retour menu
		Scanner choixMain = new Scanner(System.in);
		char choixRetourMenu = 0;
		retourMenu(choixRetourMenu, choixMain);
	}
	
	@SuppressWarnings("resource")
	public static void calculMental (int nombreCalculInt, int Bonnesrep) {
		for (int i = 0; i < nombreCalculInt; i++) {
			 
            int Nbralea1 = (int) (Math.random() * 30); // 2 Nombres aléatoires
            int Nbralea2 = (int) (Math.random() * 30);
            int NbrSoustraction = Nbralea1 - Nbralea2; // Soustraction calculée par l'ordi
            int NbrAddition = Nbralea1 + Nbralea2; // Addition calculée par l'ordi
            int OperateurAleatab = (int) (Math.random() * operateurfacile.length); // Nombre aléatoire entre 0 et la taille du tableau Débutant
            String OperateurAlea = operateurfacile[OperateurAleatab];           // Stocke le signe correspond à la
            int numCalcul = i+1;
 
            if (OperateurAlea.equals(operateurfacile[1])) // EXCEPTION Soustraction
            {
                if (Nbralea1 > Nbralea2 && Nbralea1 > 2 && Nbralea2 > 2) {
                    System.out.println("Calcul " + numCalcul + " : " + Nbralea1 + OperateurAlea + Nbralea2 + "=");
                } else {
                    while (Nbralea1 < 2 || Nbralea2 < 2 || Nbralea1 < Nbralea2) {
                        Nbralea1 = (int) (Math.random() * 30);
                        Nbralea2 = (int) (Math.random() * 30);
                        NbrSoustraction = Nbralea1 - Nbralea2;
                    }
                    System.out.println("Calcul " + numCalcul + " : " + Nbralea1 + OperateurAlea + Nbralea2 + "=");
                }
            } else if (OperateurAlea.equals(operateurfacile[0])) // Affichage de l'addition
            {
                System.out.println("Calcul " + numCalcul + " : " + Nbralea1 + OperateurAlea + Nbralea2 + "=");
            }
            else{
                System.out.println("Mauvais operateur généré par ta fonction random");
            }
            try {
	            Scanner sc = new Scanner(System.in);
	            int nbr = sc.nextInt();
	            //int nbr = Isn.readInt(); // Demande à l'utilisateur le résultat
	 
	            if (OperateurAlea.equals(operateurfacile[0]) && nbr == NbrAddition) // Comparaison résultat juste avec résultat du joueur
	            {
	                Bonnesrep++;
	                System.out.println("Résultat JUSTE\n");
	
	 
	            } else if (OperateurAlea.equals(operateurfacile[1]) && nbr == NbrSoustraction) {
	                Bonnesrep++;
	                System.out.println("Résultat JUSTE \n");
	 
	            } else if (OperateurAlea.equals(operateurfacile[0]) && nbr != NbrAddition) { // Si résultat FAUX, on affiche le bon résultat
	                System.out.println("FAUX. Bon résultat ---> " + NbrAddition + "\n");
	            } else {
	                System.out.println("FAUX. Bon résultat ---> " + NbrSoustraction + "\n");
	            }
            }catch (Exception e) {
            	Affichage.ErreurChiffre();
            	
            }
        }
		return;
	}
}

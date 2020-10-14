package com.projet.math.calcul.factory;

import java.util.Scanner;

import com.projet.math.calcul.App;
import com.projet.math.calcul.operation.Calcul;

public class factory {
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
}

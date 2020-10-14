package com.projet.math.calcul.label;

public class Affichage {
	
	public static void MenuPrincipal ()
	{
		System.out.println("-------------------------------------------"
				+ "\nBienvenue dans le menu principal"
				+ "\n-------------------------------------------"
				+ "\n\n0 - Quitter"
				+ "\n\n1 - Calcul d'hypothenuse"
				+ "\n\n2 - Calcul de surface"
				+ "\n\n3 - Calcul mental"
				+ "\n\n\nVotre choix : ");
	}
	
	public static void MauvaisChoix()
	{
		System.out.println("Ceci est un mauvais choix "
				+ "\nVoulez vous revenir au menu principal ? (o/n)"
				+ "\n\n");
	}
	
	public static void LabelSurface () {
		System.out.println("----- Cacul de la surface -----"
				+ "\n"
				+ "\n1 - Surface d'un cercle"
				+ "\n2 - Surface d'un triangle"
				+ "\n3 - Surface d'un carre"
				+ "\n4 - Surface d'un rectangle"
				+ "\n"
				+ "\nVotre choix : ");
	}
	
	public static void ErreurChiffre () {
		System.out.println("\nVeuillez entrer un chiffre valide !\n");
	}

}

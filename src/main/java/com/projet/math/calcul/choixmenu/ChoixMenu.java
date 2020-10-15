package com.projet.math.calcul.choixmenu;

import java.util.Scanner;

import com.projet.math.calcul.factory.factory;
import com.projet.math.calcul.label.Affichage;
import com.projet.math.calcul.operation.CalculMental;

public class ChoixMenu {
	
	public static void ChoixHypo (){
		factory.hypothenuse();
	}
	
	@SuppressWarnings({ "resource", "unused" })
	public static void ChoixSurface () {
		Affichage.LabelSurface();
		int choix = 0;
		Scanner choixSurface = new Scanner(System.in);
		
		Scanner choixMain = new Scanner(System.in);
		char choixRetourMenu = 0;
		SelectionSurface(choix, choixSurface, choixRetourMenu, choixMain);
	}
	
	public static void ChoixCalculMental () {
		CalculMental.NiveauDebutant();
	}
	
	public static void SelectionSurface (int choix, Scanner choixSurface, char choixRetourMenu, Scanner choixMain) {
		try {
			choix = choixSurface.nextInt();
			switch (choix)
			{
			case 0:
				factory.retourMenu(choixRetourMenu, choixMain);
			case 1:
				factory.surfaceCercle(choixRetourMenu, choixMain);
				break;
			case 2:
				factory.surfaceTriangle(choixRetourMenu, choixMain);
				break;
			case 3:
				factory.surfaceCarre(choixRetourMenu, choixMain);
				break;
			case 4:
				factory.surfaceRectangle(choixRetourMenu, choixMain);
				break;
			default:
				Affichage.ErreurChiffre();
				ChoixSurface();
			}}
		catch (Exception e) {
			Affichage.RetourMenuPrincipal();
			factory.retourMenu(choixRetourMenu, choixMain);
		}
	}
	
	
}

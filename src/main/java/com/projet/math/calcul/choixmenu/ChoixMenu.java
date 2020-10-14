package com.projet.math.calcul.choixmenu;

import java.util.Scanner;

import com.projet.math.calcul.factory.factory;
import com.projet.math.calcul.label.Affichage;
import com.projet.math.calcul.operation.CalculMental;

public class ChoixMenu {
	
	public static void ChoixHypo (){
		factory.hypothenuse();
	}
	
	@SuppressWarnings("resource")
	public static void ChoixSurface () {
		Affichage.LabelSurface();
		int choix;
		Scanner choixSurface = new Scanner(System.in);
		
		Scanner choixMain = new Scanner(System.in);
		char choixRetourMenu = 0;
		
		try {
			choix = choixSurface.nextInt();
			switch (choix)
			{
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
				Affichage.MauvaisChoix();
				factory.retourMenu(choixRetourMenu, choixMain);
			}}
		catch (Exception e) {
			Affichage.ErreurChiffre();
			ChoixSurface();
		}		
		
		
	}
	
	public static void ChoixCalculMental () {
		CalculMental.NiveauDebutant();
	}
	
	
}

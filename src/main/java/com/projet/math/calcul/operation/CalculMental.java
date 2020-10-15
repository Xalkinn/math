package com.projet.math.calcul.operation;

import java.util.Scanner;

import com.projet.math.calcul.factory.factory;

public class CalculMental {
	
	
	 
    @SuppressWarnings({ "resource", "unused" })
	public static void NiveauDebutant() {        // Début fonction Débutant
        int Bonnesrep = 0; // Nombre de bonnes réponses
        int nombreCalculInt;
        Scanner nbrCalcul = new Scanner(System.in);
        
        System.out.println("Nombre de calcul a faire : ");
        nombreCalculInt = nbrCalcul.nextInt();
        System.out.println("C'est partie pour " + nombreCalculInt + "\n");
        factory.calculMental(nombreCalculInt, Bonnesrep);
        
        	
    }

}

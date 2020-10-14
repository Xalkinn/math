package com.projet.math.calcul.operation;

import java.util.Scanner;

import com.projet.math.calcul.label.Affichage;

public class CalculMental {
	
	static String[] operateurfacile = {"+", "-"};
	 
    @SuppressWarnings({ "resource", "unused" })
	public static void NiveauDebutant() {        // Début fonction Débutant
        int Bonnesrep = 0; // Nombre de bonnes réponses
        int nombreCalculInt;
        Scanner nbrCalcul = new Scanner(System.in);
        
        System.out.println("Nombre de calcul a faire : ");
        nombreCalculInt = nbrCalcul.nextInt();
        System.out.println("C'est partie pour " + nombreCalculInt + "\n");
        
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
            	NiveauDebutant();
            }
        }
        	
    }

}

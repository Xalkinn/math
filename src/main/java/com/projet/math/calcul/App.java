package com.projet.math.calcul;

import java.util.Scanner;

import com.projet.math.calcul.choixmenu.ChoixMenu;
import com.projet.math.calcul.label.Affichage;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings({ "unused", "resource" })
	public static void main( String[] args )
    {
    	int choixMenu;
		int stopMenu;
		char choixMenuRetour = 0;
		boolean bsaisie = false ;
		Scanner scan = new Scanner(System.in);
		
		Affichage.MenuPrincipal();
		try {
			choixMenu = scan.nextInt();
			menu(choixMenu, choixMenuRetour);}
		catch (Exception e) {
			System.out.println("\nVeuillez entrer un chiffre valide !\n");
			main(null);
		}		
    }
    
    @SuppressWarnings("unused")
	public static void verificationChiffre (Scanner scan, int choixMenu) {
    	int a;
    	try {
			System.out.println("sasir note");
			choixMenu = scan.nextInt();}
		catch (Exception e) {
			
		}
    	main(null);
    }
 
    
    public static void menu (int choixMenu, char choixMenuRetour) {
    	switch (choixMenu)
		{
		case 0:
			System.out.println("Aurevoir");
			System.exit(0);
			break;
		case 1:
			ChoixMenu.ChoixHypo();
			main(null);
			break;
		case 2:
			ChoixMenu.ChoixSurface();
			main(null);
			break;
		default:
			Affichage.MauvaisChoix();
			Scanner choixRetour = new Scanner(System.in);
			choixMenuRetour = choixRetour.next().charAt(choixMenuRetour);
			
			if (choixMenuRetour == 'o' || choixMenuRetour == 'O')
				main(null);
			else if (choixMenuRetour == 'n' || choixMenuRetour == 'N')
				System.out.println("Aurevoir");
				break;
		}
    	return;
    }
}

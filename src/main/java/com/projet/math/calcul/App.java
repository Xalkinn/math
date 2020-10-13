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
    public static void main( String[] args )
    {
    	int choixMenu;
		int stopMenu;
		char choixMenuRetour = 0;

		Scanner scan = new Scanner(System.in);
		Affichage.MenuPrincipal();
		choixMenu = scan.nextInt();
		
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
				main(args);
			else if (choixMenuRetour == 'n' || choixMenuRetour == 'N')
				System.out.println("Aurevoir");
				break;
		}
    }
}

package com.projet.math.calcul.operation;

public class Calcul {
	
	public static double CalculHypo (double longueurInt, double largeurInt)
	{
		double result;
		double resultFin;
			
		result = Math.pow(longueurInt, 2) + Math.pow(largeurInt, 2);
		resultFin = Math.sqrt(result);
		return resultFin;
	}
	
	public static double CalculSurfaceCercle (double rayon)
	{
		double resultat;
		
		resultat = Math.PI * Math.pow(rayon, 2);
		return resultat;
	}
	
	public static double CalculSurfaceTriangle (double base, double hauteur)
	{
		double resultat;
		
		resultat = (base * hauteur) / 2;
		return resultat;
	}
	
	public static double CalculSurfaceCarre (double cote)
	{
		double resultat;
		
		resultat = Math.pow(cote, 2);
		return resultat;
	}
	
	public static double CalculSurfaceRectangle (double longueur, double largeur)
	{
		double resultat; 
		
		resultat = longueur * largeur;
		return resultat;
	}
}
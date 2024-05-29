package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaisonTest {
	
	  @Test
	    public void testAjouterPiece() {
	        Maison maison = new Maison();
	        Chambre chambre = new Chambre(2, 20.0);
	        Cuisine cuisine = new Cuisine(1, 20.0);
	        SalleDeBain salleDeBain = new SalleDeBain(1, 12.0);
	        WC wc = new WC(1, 2.0);
	        Salon salon = new Salon(1,30.55);
	        
	        assertEquals(0,maison.getPieces().length);

	        maison.ajouterPiece(chambre);
	        assertEquals(1, maison.nbPieces());
	        
	        maison.ajouterPiece(cuisine);
	        maison.ajouterPiece(salleDeBain);
	        maison.ajouterPiece(wc);
	        maison.ajouterPiece(salon);

	        assertEquals(5, maison.nbPieces());
	        assertEquals(84.55, maison.calculerSurface());
	        assertEquals(30.55, maison.superficieTypePiece("Salon"));
	    }
}

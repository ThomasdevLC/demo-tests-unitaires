package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaisonTest {

    @Test
    void testValueOfLibelle() {
    	
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));

        assertNull(Saison.valueOfLibelle("Invalid"));
        assertNull(Saison.valueOfLibelle("été")); 
        assertNull(Saison.valueOfLibelle("ETE")); 

        assertNull(Saison.valueOfLibelle(null));
        assertNull(Saison.valueOfLibelle(""));

        assertNull(Saison.valueOfLibelle(" Printemps")); 
        assertNull(Saison.valueOfLibelle("Printemps ")); 
        assertNull(Saison.valueOfLibelle(" Printemps "));
    }
}

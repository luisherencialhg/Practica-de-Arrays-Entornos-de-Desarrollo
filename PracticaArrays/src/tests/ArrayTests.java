package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import util.MisArrays;

public class ArrayTests {
	
	
	 	private int[] notasValidas;
	    private int[] notasNoValidas;
	   
	    
	    @BeforeAll
	    public void setUp() {
	        // Inicializa los arrays de prueba
	        int[] notasValidas = new int[]{7, 8, 9, 5, 6};
	        int[] notasNoValidas = new int[]{7, 8, 11, 5, 6}; // Contiene un valor no válido (11)
	    }

	@Test
    public void testNotaMaxima() {
		 
        int resultado = MisArrays.maximaNota(notasValidas);
        assertEquals(9, resultado); // La máxima de {7, 8, 9, 5, 6} es 9
    }
	
	@Test
    public void testMinimaNota() {
	
        int resultado = MisArrays.minimaNota(notasValidas);
        assertEquals(5, resultado); // La mínima de {7, 8, 9, 5, 6} es 5
    }
}

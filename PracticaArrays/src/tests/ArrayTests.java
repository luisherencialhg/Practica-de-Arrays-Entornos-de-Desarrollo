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
	@Test(expected = IllegalArgumentException.class)
	public void testNotaMaximaConNotasNoValidas() {
	    MisArrays.maximaNota(notasNoValidas);
	    // Debería lanzar una excepción IllegalArgumentException
	}
	
	@Test
    public void testMinimaNota() {
	
        int resultado = MisArrays.minimaNota(notasValidas);
        assertEquals(5, resultado); // La mínima de {7, 8, 9, 5, 6} es 5
    }
	@Test(expected = IllegalArgumentException.class)
	public void testMinimaNotaConNotasNoValidas() {
	    MisArrays.minimaNota(notasNoValidas);
	    // Debería lanzar una excepción IllegalArgumentException
	}
	 @Test
	    public void testMediana() {
	        float resultado = MisArrays.medianaNotas(notasValidas);
	        assertEquals(7.0f, resultado, 0.001); // La mediana de {7, 8, 9, 5, 6} es 7.0
	    }
	   @Test(expected = IllegalArgumentException.class)
	    public void testMedianaNotasConValoresNoValidos() {
	        MisArrays.medianaNotas(notasNoValidas);
	        // Debería lanzar una excepción IllegalArgumentException
	    }
	 @Test
	    public void testMediaNotas() {
	        float resultado = MisArrays.mediaNotas(notasValidas);
	        assertEquals(7.0f, resultado, 0.001); // La media de {7, 8, 9, 5, 6} es 7.0
	    }
	 @Test(expected = IllegalArgumentException.class)
	    public void testMediaNotasConValoresNoValidos() {
	        MisArrays.mediaNotas(notasNoValidas);
	        // Debería lanzar una excepción IllegalArgumentException
	    }
}

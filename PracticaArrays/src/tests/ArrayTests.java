package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import util.MisArrays;

public class ArrayTests {

	@Test
    public void testNotaMaxima() {
		   int[] notasValidas = new int[]{7, 8, 9, 5, 6};
        int resultado = MisArrays.maximaNota(notasValidas);
        assertEquals(9, resultado); // La máxima de {7, 8, 9, 5, 6} es 9
    }
}

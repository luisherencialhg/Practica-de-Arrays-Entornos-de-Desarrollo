package util;

public abstract class MisArrays {

	  public static int maximaNota(int[] notas) {
		  /* Encuentra la nota máxima en el array.
		     * @param notas Array de números enteros entre 0 y 10.
		     * @return El valor máximo en el array.
		     * @throws IllegalArgumentException Si algún número del array no está entre 0 y 10.
		     */
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
	            }
	        }
	        int max = notas[0];
	        for (int i = 1; i < notas.length; i++) {
	            if (notas[i] > max) {
	                max = notas[i];
	            }
	        }
	        return max;
	    }
}

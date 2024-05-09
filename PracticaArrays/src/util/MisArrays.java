package util;

import java.util.Arrays;

public abstract class MisArrays {
	
	/**
	 * Calcula la media de los numeros en el array.
	 * @param notas Array de números enteros entre 0 y 10.
	 * @return La media de los elementos del array.
	 * @throws IllegalArgumentException Si algún número del array no está entre 0 y 10.
	 */
	
    public static float mediaNotas(int[] notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
            }
        }

        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (float) sum / notas.length; // Cálculo de la media
    }

	
	/**
     * Calcula la mediana
     * @param notas es Array de números enteros entre 0 y 10.
     * @return La mediana de los elementos del array.
     * @throws IllegalArgumentException Si algún número del array no está entre 0 y 10.
     */
    public static float medianaNotas(int[] notas) {
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
            }
        }
        Arrays.sort(notas);
        int n = notas.length;
        if (n % 2 == 0) {
            return (notas[n/2 - 1] + notas[n/2]) / 2.0f;
        } else {
            return notas[n/2];
        }
    }

	  public static int maximaNota(int[] notas) {
		  /* Encuentra la nota máxima en el array.
		     * @param notas es un  Array de números enteros entre 0 y 10.
		     * @return. me devuelve el valor maximo del array
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
	  public static int minimaNota(int[] notas) {
		  /* Encuentra la nota minima en el array.
		     * 
		     * @return. me devuelve el valor minimo del array
		     * @throws IllegalArgumentException Si algún número del array no está entre 0 y 10.
		     */
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("La nota " + nota + " está fuera del rango permitido [0, 10]");
	            }
	        }
	        int min = notas[0];
	        for (int i = 1; i < notas.length; i++) {
	            if (notas[i] < min) {
	                min = notas[i];
	            }
	        }
	        return min;
	    }
}

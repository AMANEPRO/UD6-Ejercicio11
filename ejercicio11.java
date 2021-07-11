package UD6;

import javax.swing.JOptionPane;

import java.util.Random;

public class ejercicio11 {

	public static void main (String [] args) {
		
		String largoarraybeta = JOptionPane.showInputDialog("Introduce el largo de los arrays");
		
		int largoarray = Integer.parseInt(largoarraybeta);
		
		int array1[] = new int [largoarray];
		
		int array2[] = new int [array1.length];
		
		int array3[] = new int [array2.length];
		
		array1 = nuevovalor(array1);
		
		array2 = array1;
		
		array2 = new int [array1.length];
		
		array2 = nuevovalor(array2);
		
		array3 = multiplicacionarrays(array1, array2);
		
		System.out.println("Array 1: " + array1);
		
		System.out.println("Array 2: " + array2);
		
		System.out.println("Array 3: " + array3);
		
	}
	
	public static int[] nuevovalor(int array[]) {
		
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = 1 + random.nextInt(10);
			
		}
		
		return array;
	}
	public static int [] multiplicacionarrays (int array1[], int array2[]) {
	
		int arrayfinal[] = new int [array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			
			arrayfinal[i] = array1[i] * array2[i];
			
		}
		
		return arrayfinal;
		
	}
	
	public static void mostrararray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + (i+1) + ": " + array[i]);
		}
	}
}

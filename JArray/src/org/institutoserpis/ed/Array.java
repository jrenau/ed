package org.institutoserpis.ed;

public class Array {

	public static void main(String[] args) {
		
		
		int[] v = new int[] {5, 9, 7, 12, 21};
		
		
		for(int index=0; index < v.length; index++)
		System.out.println("el elemento con index " + index + " vale " + v[index]);
		
		System.out.println("suma del array= " + suma(v));
		System.out.println("suma del otro array= " + suma(new int[]{14, 24}));
		System.out.println("suma del array vacio= " + suma(new int[]{}));
	}
	
	public static int suma(int[] v){
		//número de elementos del vector: v.length
		int suma = 0;
		
//		for (int index=0; index < v.length; index++)
//			suma = suma + v[index];
		
		for (int item : v)
			suma = suma + item;
		
		return suma;
	}
	public static int menor(int[] v){
		//TODO implemetar
		int menor = v[0];
		System.out.println("El valor menor de v es: " + menor(v));
		return 0;
	}
public static int indexOf(int[] v, int item) {
		//TODO implemetar
		System.out.println(" " + menor(v));
		return item; 
		
}
}

package clases;

public class recursividad {


	
	public int Potencia( int base, int exponente ) {
		if ( exponente == 1 ) return base;
		return base * Potencia(base, exponente - 1);
	}
	
	
	// suma de 1 hasta N  6 -> 1 + 2 + 3 + 4 + 5 + 6
	// cantidad digitos  12345 -> 5
	// fibonacci
	// reves     "omar"  -> "ramo"
	// binario   64  -> 01000000
	
	
	public static void main(String[] args) {
		recursividad recursividad = new recursividad();
		System.out.println( recursividad.Potencia(3,3) );	
	}
}
package clases;

public class recursividad5 {

	public int Multiplicar(int n1, int n2) {
		if ( n2 == 1 ) return n1;
		return n1 + Multiplicar(n1, n2 - 1);
	}
	
	
	public static void main(String[] args) {
		recursividad5 recursividad = new recursividad5();
		System.out.println( recursividad.Multiplicar(3,3) );	
	}
}
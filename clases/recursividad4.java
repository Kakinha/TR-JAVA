package clases;

public class recursividad4 {

	
	public int Factorial( int n, int i ) {
		if (  n == 1 ) return 1;
		return n * Factorial(n - 1, i);
	}

	
	
	public static void main(String[] args) {
		recursividad4 recursividad = new recursividad4();
		System.out.println( recursividad.Factorial(3,3) );	
	}
}
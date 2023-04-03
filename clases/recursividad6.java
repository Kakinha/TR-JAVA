package clases;
import java.util.Scanner;
public class recursividad6 {

	



	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        System.out.println("Introduce el número: ");
	        int numero = teclado.nextInt();
	        teclado.close();        
	        for (int i = 0; i < numero; i++) {
	            System.out.print(" " + fibonacci(i));
	        }
	         
	    }
	    
	    
	    public static int fibonacci(int numero) {
	 
	        if ((numero == 0) || (numero == 1)) 
	            return numero;
	        else
	            return fibonacci(numero - 1) + fibonacci(numero - 2);
	    }
	    
	}
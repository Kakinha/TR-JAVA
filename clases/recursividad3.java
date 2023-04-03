
package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursividad3 {
    public static String invertir(String cad, int tamaño){
        String c2="";        
        if(tamaño==0){
            c2+=cad.charAt(tamaño);
            return c2;
        }
        else{
            c2=cad.charAt(tamaño)+invertir(cad, tamaño-1);
            return c2;
        }       
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tamaño;
        String cadena;
        System.out.println("Ingrese la cadena a evaluar: ");
        cadena=br.readLine();
        tamaño=cadena.length()-1;

        System.out.println("La nueva cadena es: "+invertir(cadena, tamaño));       
    }
}

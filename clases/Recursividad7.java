package clases;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursividad7 {

//Detectar si es numero positivo o negativo
    public static char valor(int numero){
        if(numero<=0){
            return 'N';
        }
        else{
            return 'P';
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n;
        char v;
        System.out.println("Igrese el numero: ");
        n=Integer.parseInt(br.readLine());

        v=valor(n);
        if(v=='P'){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }
    }
}

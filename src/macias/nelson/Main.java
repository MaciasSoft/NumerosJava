package macias.nelson;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner escan=new Scanner(System.in);

        int n = 0;

        do {
            System.out.println("Introduce un numero, introdusca:0 para terminar");


            String valor = escan.nextLine();

            Numero resp = new Numero(n);
            //System.out.println("El numero comparado es par..? \n"+resp.numeroPar());
            if (resp.numeroPar()) {
                System.out.println("el numero ingresado es par");
            } else {
                System.out.println("es impar");
            }
        }
        while (n!=0);

    }
}

package macias.nelson;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner escan=new Scanner(System.in);
        System.out.println("Introduce el numero a ser comparado:");
        String valor=escan.nextLine();

        int n=Integer.parseInt(valor);

        Numero resp=new Numero(n);
        //System.out.println("El numero comparado es par..? \n"+resp.numeroPar());
        if (resp.numeroPar())
        {
            System.out.println("el numero ingresado es par");
        }
        else
        {
            System.out.println("es impar");
        }

    }
}

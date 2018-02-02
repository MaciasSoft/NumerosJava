package macias.nelson;
import java.util.*;
public class Numero {
    int num;


    public Numero(int num)
    {
        this.num=num;
    }
    public boolean numeroPar()
    {
       return num%2==0;//evalua si el numero es par
    }
}


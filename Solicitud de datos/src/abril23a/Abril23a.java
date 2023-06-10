
package abril23a;

import java.util.Scanner;

public class Abril23a {

    public static void main(String[] args) 
    {
        int datoA, datoB, suma, resta, mult, div, mod;
        Scanner entrada=new Scanner(System.in);
        Abril23a ojb = new Abril23a();
        ingreso()
        operaciones()
        resultado()
    }
////////////////////////////////////////////////////////////////////////    
    public static void ingreso()
{
    System.out.println("\nIngrese datoA\n");
    datoA=entrada.nextInt();
    System.out.println("\nIngrese datoB\n");
    datoB=entrada.nextInt();
    System.out.println("\nDatoA=" + datoA + "\nDatoB=" + datoB);
}
////////////////////////////////////////////////////////////////////////

    public static void operaciones()
{
    suma= datoA+datoB;
    resta= datoA-datoB;
    mult= datoA*datoB;
    div= datoA/datoB;
}

/////////////////////////////////////////////////////////////////////////////

    public static void resultado()
{
    System.out.println("\nLa suma es " + suma);
    System.out.println("\nLa resta es " + resta);
    System.out.println("\nLa multiplicacion es " + mult);
    System.out.println("\nLa division es " + div);
    System.out.println("\nEL modulo es " + mod);
}

}

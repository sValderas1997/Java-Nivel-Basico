
package abril22d;


public class Abril22d {

    
    public static void main(String[] args) 
    {
        float datoA=10.15F,datoB=3.2F,suma, resta, mult, div;
        
        System.out.println("\nProgramacion \nGrafica \t2020\n");
        System.out.println("\nDatoA=" + String.format("%.3f",datoA) + "\nDatoB=" + String.format("%.3f",datoB));
        
        suma=datoA+datoB;
        resta=datoA-datoB;
        mult=datoA*datoB;
        div=datoA/datoB;
   
        
        System.out.println("\nLa suma es " + String.format("%.2f",suma));
        System.out.println("\nLa resta es " + String.format("%.1f",resta));
        System.out.println("\nLa multiplicacion es " + String.format("%.3f",mult));
        System.out.println("\nLa division es " + String.format("%.2f",div));
        
    }
    
}

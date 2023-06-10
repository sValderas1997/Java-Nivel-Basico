
package nov03;

import java.util.Scanner;
import java.lang.Math;

public class Nov03 
{


    public static void main(String[] args) 
    {
        byte var1=0;
        byte conta;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: \n");
        var1=entrada.nextByte();
        
        System.out.print("El valor ingresado es =\n");
        
        if(var1>100)
        {
            System.out.print("Valor mayor a 100\n");
        }
        else
        {
            System.out.print("Valor menor a 100\n");
        }
        
        switch(var1)
        {
            case 1:
            
            System.out.print("Valor=1\n");
            
            break;
            
            case 2:
            
            System.out.print("Valor=2\n");
            
            break;
            
            case 3:
            
            System.out.print("Valor=3\n");
            
            break;
            
            default:
            
            System.out.print("Valor distinto de 1,2,3\n");
            
            break;
            
            for(conta=0 conta<3 conta++)
            {
                System.out.print("FOR\n");
            }
            conta=0;
            for(conta<3)
            {
                System.out.print("WHILE\n");
            }
            
            
        }
            
    }
    
}

/*
el programa instancia un objeto de la clase Persona, establece su edad utilizando un método setEdad() y luego muestra la edad utilizando un método getEdad().
package nov16.java;
*/

public class Nov16Java 
{
    public static void main(String[] args) 
    {
        //Instanciar un objeto de una clase
        Persona sujeto1= new Persona();
        
        sujeto1.setEdad(33);
        
        System.out.println("Edad sujeto 1: "+sujeto1.getEdad());
        
        
    }
}

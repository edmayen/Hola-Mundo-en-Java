/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author edmayen
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        int valor1=scanner.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        int valor2=scanner.nextInt();
        if(valor1>valor2)
        {
            System.out.println("El valor de "+valor1+" es mayor que "+valor2);
        }
        else
        {
            System.out.println("El valor de "+valor2+" es mayor que "+valor1);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.tareaudemy_7;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Tarea7 {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        float numero = Float.parseFloat(scanner.nextLine());
        
        if (numero>=9)
            System.out.println("A");
        else if (numero<9 && numero >=8)
            System.out.println("B");
        else if (numero<8 && numero >=7)
            System.out.println("C");
        else if (numero<7 && numero >=6)
            System.out.println("D");
        else if (numero<6 && numero >=0)
            System.out.println("F");
    
    
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;
import java.lang.Math. *;

/**
 *
 * @author Kevin
 */
public class Math {
    private static Object Math;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        int n=0, m=0;
        int r=0;
        
        System.out.println("Ingrese dos variables: ");
        n=leer.nextInt();
        m=leer.nextInt();
        r=Math.abs(n);
        System.out.println("");
    }
    
}

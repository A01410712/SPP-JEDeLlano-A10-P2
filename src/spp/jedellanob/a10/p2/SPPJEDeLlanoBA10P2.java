/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.a10.p2;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class SPPJEDeLlanoBA10P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner kb = new Scanner (System.in);
        int sumaArreglos1[][];
                int numeroFilas;
                int numeroColumnas;
                int datoCasilla1;
                int sumaArreglos2[][];
                int datoCasilla2;
                int sumaTotal;
                
                System.out.println("Ingrese el numero de filas que tendrán los arreglos");
                numeroFilas = kb.nextInt();
                System.out.println("Ingrese en numero de columnas que tendrán sus arreglos:");
                numeroColumnas = kb.nextInt(); 
                sumaArreglos1 = new int [numeroFilas][numeroColumnas];
                for(int i = 0; i < sumaArreglos1.length; i++){
                    for(int j = 0; j < sumaArreglos1[i].length; j++){
                        System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                        datoCasilla1 = kb.nextInt(); 
                        sumaArreglos1[i][j] = datoCasilla1; 
                    }
                }
                sumaArreglos2 = new int [numeroFilas][numeroColumnas];
                for(int i = 0; i < sumaArreglos2.length; i++){
                    for(int j = 0; j < sumaArreglos1[i].length; j++){
                        System.out.println("Ingrese el numero que se guardara en esta casilla: ");
                        datoCasilla2 = kb.nextInt(); 
                        sumaArreglos2[i][j] = datoCasilla2; 
                        
                        
                    }
                }
                 for(int i = 0; i < sumaArreglos1.length; i++){
                    for(int j = 0; j < sumaArreglos1[i].length; j++){
                        sumaTotal = sumaArreglos1[i][j] * sumaArreglos2[i][j];
                        System.out.println("La multiplicacion de los numeros: " + sumaArreglos1[i][j]  + "y " + sumaArreglos2[i][j] + " es:" + sumaTotal);
                    }
                 }
        
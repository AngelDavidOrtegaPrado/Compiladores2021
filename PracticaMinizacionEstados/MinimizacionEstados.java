package MinimizaciónEstadosAFD;

import java.io.*;
import java.util.*;
/**
 *
 * @author Angel David Ortega Prado
 * Algoritmo de Minización de estados
 * 
 * Entrada:  Un AFD D con un conjunto de estados S, el alfabeto de entrada Σ, el estado
 * inicial s0 y el conjunto de estados de aceptación F.
 * 
 * Salida: Un AFD D',que acepta el mismo lenguaje que D y tiene el menor número de estados posible.
 */
public class MinimizacionEstados {
    public String alfabeto;
    
    public void iniciaAutomata(){
        
    }
    
    public static void main(String[] args) {
    }
        
        public void inicio(){ 
            
            int noEstadosM1;
            int noEstadosM2;
            
            System.out.print("Alfabeto (∑={0,1}):"); 
            Scanner estados = new Scanner(System.in);
            System.out.println("No. de estados M1:");
            noEstadosM1 = estados.nextInt();
            
            m1 = new AFD(alfabeto,noEstadosM1);
            m1.llenarEstados();
        
            System.out.println("No. de estados M1:");
            noEstadosM2 = estados.nextInt();
            
            m2 = new AFD(alfabeto,noEstadosM2);
            m2.llenarEstados();
        }

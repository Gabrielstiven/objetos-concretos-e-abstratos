/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadeirao;

import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Cadeirao {

    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner tecladoString = new Scanner (System.in);

        
        System.out.println("digite a marca da cadeira: ");
        String marcaC1 = tecladoString.nextLine();
        
        System.out.println("digite como é a cadeira, ex:\n gamer, escritorio, cozinha, etc...");
        String comoéC1 = tecladoString.nextLine();
        
        System.out.println("digite a cor da cadeira");
        String corC1 = tecladoString.nextLine();

        
        
        
        
        
        Cadeirao1 c1 = new Cadeirao1();
        c1.comoé = comoéC1;
        c1.cor = corC1;
        c1.marca = marcaC1;
        
        boolean respostaSentado = c1.perguntarSentado();
        c1.empé = respostaSentado;
                
        c1.estado();
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_9;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */

/* Desenvolva um algoritmo em Java que leia um número inteiro e imprima em um arquivo TXT a tabuada do número.

Obs.: Grave o arquivo na área de trabalho.

 

Dica:

** FileWriter

** PrintWriter

Observe a aplicação do código na figura.
*/

public class Pergunta_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}



   

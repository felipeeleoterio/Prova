/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_6;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */

/*Construa um algoritmo para ler um número N informado pelo usuário, ao final deverá ser calculado a média, soma e a quantidade dos valores digitados.
*/

public class Pergunta_6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
     
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
 
         int media = (numero1+numero2)/2;
         
         int soma = numero1 + numero2;
         
         System.out.println(" A soma de " +numero1+ "e" +numero2+ " é:" +soma+"e a media é :"+media);
         
    
    }
}

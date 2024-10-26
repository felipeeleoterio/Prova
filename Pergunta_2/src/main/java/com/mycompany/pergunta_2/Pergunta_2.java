/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_2;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */


/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.

(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

public class Pergunta_2 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);    
        
        System.out.println("Digite sua idade em anos ");
        int anos = scanner.nextInt();
    
        System.out.println("Digite sua idade em meses ");
        int meses = scanner.nextInt();
        
        System.out.println("Digite sua idade em dias ");
        int dias = scanner.nextInt();
    
    int iddias =  (anos*365)+(meses*30)+ dias;
        
    System.out.println("Sua idade em dias é" +iddias);
    
    }
    }





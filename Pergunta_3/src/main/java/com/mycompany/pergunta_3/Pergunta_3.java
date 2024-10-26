/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_3;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */


/*
Faça um programa de controle de máquina de café, levando em consideração:

A máquina irá fazer repetidamente a leitura das seguintes opções: 1 - café expresso; 2 - café capuccino; 3 - leite com café; 4 - totalizar vendas;

• As opções de 1 a 3 realizam pedidos de café, que recebem respectivamente R$ 0,75, R$ 1,00 e R$ 1,25 em moeda;

• A opção 4 realiza a totalização dos cafés vendidos, finalizando a venda até o momento, imprimindo um relatório com as seguintes informações:

• quantidade e valor de café expresso vendido;

• quantidade e valor de café capuccino vendido;

• quantidade e valor de leite com café vendido;

• quantidade e valor de todos cafés vendidos;

Observação:
• considere que inicialmente as quantidades de cafés vendidos são nulos e que a máquina irá verificar se a opção digitada é válida ou não, repetindo a leitura, até que uma entrada válida seja fornecida.
*/
public class Pergunta_3 {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("1- Café expresso");
        System.out.println("2- Café capuccino");
        System.out.println("3- Leite com café");
        System.out.println("4- totalizar vendas");
        int opcao = scanner.nextInt();
        
     double valorce = 0,75 ;
     double valorce = 0,75 ; 
        
    }
}

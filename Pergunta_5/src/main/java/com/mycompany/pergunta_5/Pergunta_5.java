/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_5;
import java.util.Scanner;
/**
 *
 * @author f.silva
 */


/*Faça um algoritmo para ler um número que é um código de usuário. 
Caso este código seja diferente de um código armazenado internamente no algoritmo 
(igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. 
Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) 
deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido
package com.mycompany.pergunta_5;
*/

public class Pergunta_5 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o codigo: ");
        int codigo = scanner.nextInt();
        
        if(codigo == 1234){
        System.out.println("Digite a senha: ");   
        int senha = scanner.nextInt();
        
        }else{
        System.out.println("Usuario Invalido ");       
        
        }

        scanner.close();
   }

   
}

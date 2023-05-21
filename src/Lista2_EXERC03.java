/* Nome do Aluno: Bruno Almeida Vilela
* RA: 323124929
* Nome do Programa: Lista2_EXERC03
* Descrição: 3. Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data: 20/05/2023 
*/   

import java.util.Scanner;

public class Lista2_EXERC03 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        input.close();
        
        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        
    
    }

}
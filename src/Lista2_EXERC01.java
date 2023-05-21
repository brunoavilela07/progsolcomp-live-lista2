/* Nome do Aluno: BrunoAlmeida Vilela
 * RA: 323124929
 * Nome do Programa: Exerc01
 * Descrição: Faça um programa que leia dois números A e B e imprima o maior
deles.
 * Data: 20/05/2023
 */

import java.util.Scanner;
 public class Lista2_EXERC01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new  Scanner (System.in);

        int A;
        int B;
        System.out.println("Digite o primeiro número: ");
        A = input.nextInt();
        System.out.println("Digite o segundo número: ");
        B = input.nextInt();
        input.close();
        if (A > B){
        System.out.println("O maior número é " + A);
        } 
        else if (B > A){
            System.out.println("O maior número é " + B);
        } else {
            System.out.println("São iguais");
        } 
    }
}

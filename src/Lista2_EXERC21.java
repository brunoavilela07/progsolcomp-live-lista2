/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC21
 * Descrição: Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
 * Data: 20/04/2023
 */

 import java.util.Scanner;
public class Lista2_EXERC21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = input.nextInt();

        if (numero <= 0) {
            System.out.println("O número digitado não é válido. Por favor, digite um número positivo.");
            input.close();
            return;
        }

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }

        input.close();
    }
}
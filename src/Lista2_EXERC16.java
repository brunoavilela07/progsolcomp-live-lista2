/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa:Lista2_EXERC16
 * Descrição: Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
 * Data: 20/05/2023
 */

 import java.util.Scanner;
public class Lista2_EXERC16 {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    
    int numero = 0;
    while (numero >= 0) {
        System.out.print("Digite um número: ");
        numero = input.nextInt();
        if (numero < 0){
            System.out.println("Número correto!!");
            
        } else if (numero >= 0) {
            System.out.println("Por favor, tente novamente.");
        }
    }
    System.out.println("Programa encerrado.");
    input.close();
    
}
}
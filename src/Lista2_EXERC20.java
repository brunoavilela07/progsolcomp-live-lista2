/* Nome do Aluno: Bruno Almeida Vilela
 * RA:  323124929
 * Nome do Programa: Lista2_EXERC20
 * Descrição: Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
 * Data: 20/05/2023
 */

 import java.util.Scanner;
public class Lista2_EXERC20 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a carga máxima do elevador?");
        double cargaM;
        cargaM = input.nextDouble();
        System.out.println("Qual a quantidade máxima de pessoas?");
        int quantP;
        quantP = input.nextInt();
        double pesoP;
        double pesoT = 0;

        do{
System.out.println("Qual o peso da pessoa entrando no elevador?");
pesoP = input.nextDouble();
pesoT+=pesoP;
quantP +=
pesoT +=pesoP;


        }while( pesoT <= cargaM );
        System.out.println("Carga atingida, com "+ pesoT + "kg");
        input.close();
    }
    
}

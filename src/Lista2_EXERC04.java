/* Nome do aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do programa: Lista2_EXERC04
 * Descrição: Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.
 * Data: 20/05/2023
 */

 import java.util.Scanner;
 public class Lista2_EXERC04 {
     public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      
      int ni;
      System.out.println("Digite um número inteiro: ");
     ni = input.nextInt();
 
 input.close();
 
 
 if (ni % 2 == 0){
 System.out.println("Par");
 } else{
     System.out.println("Ímpar");
 }
 if (ni >= 0){
     System.out.println(" positivo");
 }else {
     System.out.println(" negativo");
 }
 
     }
 }

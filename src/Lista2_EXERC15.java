/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa:Lista2_EXERC15
 * Descrição: Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas
 * Data: 20/05/2023
 */

public class Lista2_EXERC15 {
    public static void main(String[] args) throws Exception {
      
        final int linha=10;
        final int coluna=10;
      int [] [] numeros = new int [linha] [coluna];
  
  for (int l=0; l< linha; l++){
  for (int c=0; c< coluna; c++){
  numeros[l][c]= 0;
     }
  }
  
  for (int l=0; l< linha; l++){
      for (int c=0; c< coluna; c++){
      System.out.printf("%d - ", numeros[l][c]);
         }
         System.out.printf("%n");
      }
  
  }
}


/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa:Lista2_EXERC13
 * Descrição: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma
 * Data: 20/05/2023
 */
public class Lista2_EXERC13 {
    public static void main(String[] args) throws Exception {
        
        int numeros = 0;
        int soma = 0;
     
     System.out.print("O valor da soma dos números de 1 a 100 é: ");
     
     while (numeros<=100){
         soma += numeros;
         numeros++;
       
     }
     System.out.println(soma);
        }
}

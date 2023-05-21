/* Nome do Aluno: Bruno Almeia Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC18
 * Descrição: Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
 * Data: 20/05/2023
 */
public class Lista2_EXERC18 {
    public static void main(String[] args) throws Exception {


        int numero = 7;
        double fatorial = 1;
    
          for (int i= 1; i<= numero; i++ ){
            fatorial = fatorial * i;
          }
          System.out.println("O fatorial de "+ numero + " é "+ fatorial +".");
        }
}

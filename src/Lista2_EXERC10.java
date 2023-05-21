/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC10
 * Descrição: Faça um programa que imprima todos os números pares de 1
a 100
 * Data: 20/05/2023 
 */

public class Lista2_EXERC10 {
    public static void main(String[] args) throws Exception {
        int Np;

        for (Np = 1; Np<=100; Np++) {

            if (Np % 2 == 0) {
                System.out.println(Np);
            }
        }
    }
}

/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC17
 * Descrição: Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)
 * Data:20/05/2023
 */
public class Lista2_EXERC17 {
    public static void main(String[] args) {
        int numero = -7;
    
        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero >= -1000);
    }
    
}

/*Nome do Aluno: Bruno Almeida Vilela
* RA: 323124929
* Nome do Programa: Lista2_EXERC12
* Descrição:12. Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize do/while)
* Data: 20/05/2023 
*/   

public class Lista2_EXERC12 {
    public static void main(String[] args) {
        int numero = 0;
        
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero += 2;
        } while (numero % 7 != 0);
    }
}
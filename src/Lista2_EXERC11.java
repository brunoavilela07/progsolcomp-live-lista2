/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC11
 * Descrição: Faça um programa que imprima todos os números pares de 1 a 100
na ordem inversa
 * Data:20/05/2023
 */
public class Lista2_EXERC11 {
    public static void main(String[] args) throws Exception {
        
        int Np2;

        for (Np2 = 100; Np2 >=0; Np2-- ){
            if (Np2 % 2 == 0){
                System.out.println(Np2);
            }
        }
    }
}

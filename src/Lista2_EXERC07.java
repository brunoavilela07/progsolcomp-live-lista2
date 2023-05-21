/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC07
 * Descrição: Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
 * Data: 20/05/2023
 */
import java.util.Scanner;
 public class Lista2_EXERC07 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double diaria;
        System.out.println("Quantos dias você pretender ficar hospedado nesse Hotel?");
        diaria = input.nextDouble();
        input.close();
        double PrecoDiaria;
        PrecoDiaria = 60.00;

if (diaria > 15){
    System.out.println(PrecoDiaria + (5.50/ diaria) );
} else if(diaria == 15){
    System.out.println(PrecoDiaria + (6.0/diaria));
} else if ( diaria < 15) {
    System.out.println(PrecoDiaria + (8.0 /diaria) );
} else{
    System.out.println("Não imprime nada");
}

    }

}

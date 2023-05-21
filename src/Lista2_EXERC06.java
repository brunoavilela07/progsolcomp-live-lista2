/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC06
 * Descrição: Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
 * Data: 20/05/2023
 */
import java.util.Scanner;
 public class Lista2_EXERC06 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int conceito;
      System.out.println("Qual a nota do aluno?");
      conceito = input.nextInt();
      input.close();

    if (conceito <= 49 && conceito >= 0){
        System.out.println(" Nota conceito Insuficiente");
    } else if (conceito <= 64 && conceito >= 50){
System.out.println(" Nota conceito Regular");
    } else if (conceito <= 84 && conceito >= 65){
        System.out.println(" Nota conceito Boa");
    } else if (conceito <= 100 && conceito >=85){
        System.out.println(" Nota conceito Ótima");
    }else {
        System.out.println("retorna nada");
    }

    }
}

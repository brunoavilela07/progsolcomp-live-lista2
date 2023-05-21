/* Nome do aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do projeto: Lista2_EXERC09
 * Descrição: Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
 * Data: 20/05/2023
 */

 import java.util.Scanner;
public class Lista2_EXERC09 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
double valorVenda;
System.out.println("Valor da venda realizada: ");
valorVenda = input.nextDouble();
String condicaoPagammento;
System.out.println("Qual a condição de pagamento escolhida: (a Vista, a Prazo 30 dias, a Prazo 60 dias, a Prazo 90 dias, cartão de débito ou cartão de crédito): ");
condicaoPagammento = input.next();

input.close();

if (condicaoPagammento.equals("a Vista")){
    System.out.println("R$" + valorVenda / 0.10);
} else if (condicaoPagammento.equals("a Prazo 30 dias")){
    System.out.println("R$" + valorVenda / 0.05);
}else if (condicaoPagammento.equals("a Prazo 60 dias")) {
    System.out.println("R$" + valorVenda );
} else if ( condicaoPagammento.equals("a Prazo 90 dias")){
    System.out.println("R$" + valorVenda * 0.05);
} else if (condicaoPagammento.equals("cartão de débito")){
    System.out.println("R$" + valorVenda / 0.08);
} else if (condicaoPagammento.equals("cartão de crédito")){
    System.out.println("R$" + valorVenda / 0.07);
} else {

}

    }
}

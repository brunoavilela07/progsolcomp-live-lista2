/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do programa: Lista2_EXERC05
 * Descrição: Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
 * Data: 20/05/2023
 */
import java.util.Scanner;
public class Lista2_EXERC05 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu Nome:");
        String nome;
        nome = input.next();
        System.out.println("Digite o seu sobrenome: ");
        String Sobrenome;
        Sobrenome = input.next();
        System.out.println("Digite a sua Idade em anos: ");
        int idade;
        idade = input.nextInt();
        System.out.println("Digite a Naturalidade: ");
        String naturalidade;
        naturalidade = input.next();
        System.out.println("Deseja vizualizar dados completos? (Digite S para sim e N para não)");
       String visualizar = input.next();
        input.close();

        if (visualizar.equals("S")){
        System.out.println("Nome :"+ nome);
        System.out.println("Sobrenome: "+ Sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Naturalidade: "+ naturalidade);

        }else if (visualizar.equals("N")){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    } else {
        System.out.println("Digitação errada. Tente novamente.");
    }
    }
}
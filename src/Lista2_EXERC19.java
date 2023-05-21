/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Programa: Lista2_EXERC19
 * Descrição: Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
 * Data: 20/05/2023
 */

 import java.util.Scanner;
public class Lista2_EXERC19 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

System.out.println("Qual o volume inicial?");
int volume;
double tempo = 0;
volume = input.nextInt();


while(volume <=100){
    volume *=
    tempo += volume;
    
}
System.out.println("0 tempo necessário para queesse volume se torne maior que 1000 cm³ é de " + tempo + " segundos");
input.close();
    }

    
}

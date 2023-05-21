/* Nome do Aluno: Bruno Almeida Vilela
 * RA: 323124929
 * Nome do Projeto: Lista2_EXERC02
 * Descrição: Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.
 * Data: 20/05/2023
 */
import java.util.Scanner;
 public class Lista2_EXERC02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
      
      System.out.print("Digite o primeiro número: ");
      int n1;
      n1 = input.nextInt();

      System.out.print("Digite o segundo número: ");
      int n2;
      n2 = input.nextInt();

      System.out.print("Digite o terceiro número: ");
      int n3;
      n3 = input.nextInt();
     input.close();
      
     if (n1 < n2){
if (n2 < n3){
    System.out.println(n1 +"\n"+ n2+"\n"+n3);
}
else if (n1 < n3){
    System.out.println(n1+"\n"+n3+"\n"+n2);
} else {
    System.out.println(n3+"\n"+ n1+"\n"+n2);
}

} else if (n2 < n3){
    if (n1< n3){
        System.out.println(n2+"\n"+n3+"\n"+n1);
    } else{
        System.out.println(n2+"\n"+n1+"\n"+n3);
    }
}else {
    System.out.println(n3+"\n"+n2+"\n"+n1);
}
    }
}
import java.util.Scanner;

/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */
public class AprovadoReprovado {
  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

    double nota1, nota2, nota3;

    System.out.println("Digite a primeira nota: ");
    nota1 = scanner.nextDouble();

    System.out.println("Digite a segunda nota: ");
    nota2 = scanner.nextDouble();

    System.out.println("Digite a terceira nota: ");
    nota3 = scanner.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    if (media >= 6.0) {
      System.out.println("Você foi aprovado!");
    } else {
      System.out.println("Você foi reprovado. Precisa estudar mais na próxima.");
    }
  }
}
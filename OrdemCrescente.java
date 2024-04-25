import java.util.Arrays;
import java.util.Scanner;

/*
 * Leia 3 números e imprima-os em ordem crescente.
 */
public class OrdemCrescente {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 3 números: ");
    int numeros = scanner.nextInt();

    Arrays.sort(new int[]{numeros});

    System.out.println("Sequência ordenada em ordem crescente:");

    scanner.close();
  }
}

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou ímpar.
 */
public class ParImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero para descobrir se ele é par ou ímpar: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0) {
      System.out.println(numero + " é par.");
    } else {
        System.out.println(numero + " é impar.");
      }

    }
  }


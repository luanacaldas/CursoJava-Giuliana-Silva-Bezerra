import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número para cálculo: ");
    double numero1 = scanner.nextDouble();

    System.out.println("Digite o segundo número para cálculo: ");
    double numero2 = scanner.nextDouble();

    System.out.println("Digite a operação (adição, subtração, multiplicação ou divisão): ");
    String operacaoDigitada = scanner.next();

      switch (operacaoDigitada) {
          case "+" -> {
              double resultado = numero1 + numero2;
              System.out.println("O resultado é: " + resultado);
          }
          case "-" -> {
              double resultado = numero1 - numero2;
              System.out.println("O resultado é: " + resultado);
          }
          case "/" -> {
              if (numero2 != 0) {
                  double resultado = numero1 / numero2;
                  System.out.println("O resultado é: " + resultado);
              } else {
                  System.out.println("Não é possível dividir por zero!");
              }
          }
          case "*" -> {
              double resultado = numero1 * numero2;
              System.out.println("O resultado é: " + resultado);
          }
          default -> System.out.println("Operação inválida!");
      }

    scanner.close();
  }
}

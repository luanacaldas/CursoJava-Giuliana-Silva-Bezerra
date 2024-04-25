import java.util.Scanner;

/*
 * Crie uma calculadora de IMC que mostra em que classificação a
 * pessoa está:
 * 
 * Menor que 18,5    -> MAGREZA
 * Entre 18,5 e 24,9 -> NORMAL
 * Entre 25 e 29,9   -> SOBREPESO
 * Entre 30 e 39,9   -> OBESIDADE
 * Maior que 40      -> OBESIDADE GRAVE
 * 
 * IMC = peso / altura * altura
 * 
 */
import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu peso: ");
    double peso = scanner.nextDouble();

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("Seu IMC é: " + imc);

    if (imc < 18.5) {
      System.out.printf("MAGREZA");
    } else if (imc == 24.9) {
      System.out.printf("NORMAL");
    } else if (imc == 29.9) {
      System.out.printf("SOBREPESO");
    } else if (imc == 39.9) {
      System.out.printf("OBESIDADE");
    } else {
      if (imc > 40) {
        System.out.printf("OBESIDADE GRAVE");
      } else {
        System.out.printf("Fora da faixa de classificação");
      }
    }

    scanner.close();
  }
}

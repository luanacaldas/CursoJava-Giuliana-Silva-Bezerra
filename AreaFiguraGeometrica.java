import java.util.Scanner;

/*
 * Dada uma figura geométrica (retangulo, triangulo, circulo), informar a sua área.
 *
 * retangulo = base x altura
 * triangulo = (base x altura) / 2
 * circulo = pi x (raio * raio)
 */

public class AreaFiguraGeometrica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a figura geometrica (retangulo, triangulo, circulo): ");
    String figuraGeometrica = scanner.nextLine();

    double area = 0;

    if (figuraGeometrica.equals("retangulo")) {
      System.out.println("Digite a base do retangulo: ");
      double baseRetangulo= scanner.nextDouble();

      System.out.println("Digite a altura do retangulo: ");
      double alturaRetangulo = scanner.nextDouble();

      area = baseRetangulo * alturaRetangulo;
    } else if (figuraGeometrica.equals("triangulo")) {
      System.out.println("Digite a base do triangulo: ");
      double baseTriangulo = scanner.nextDouble();

      System.out.println("Digite a altura do triangulo: ");
      double alturaTriangulo = scanner.nextDouble();

      area = (baseTriangulo * alturaTriangulo) / 2;
    } else if (figuraGeometrica.equals("circulo")) {
      System.out.println("Digite raio do circulo: ");
      double raioCirculo = scanner.nextDouble();

      area = Math.PI * raioCirculo * raioCirculo;
    } else {
      System.out.println("Figura geometrica nao suportada.");
    }

    System.out.println("A area da figura geometrica " + figuraGeometrica + " e: " + area);

    scanner.close();
  }
}


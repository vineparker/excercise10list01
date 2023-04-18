import java.util.Scanner;

class Main {
  // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
  public static void main(String[] args) {

    // declaração da variáveis 
    Scanner input = new Scanner(System.in);
    int convertC = 32;
    

    // informe o raio de um circulo
    String textoUm = "Insira um valor em graus Celcius (°C): ";
    System.out.print(textoUm);
    float tempC = input.nextFloat();

    // fazer a conversão de F para C
    float tempF = tempC * (9 / 5) + convertC; 

    // mostrar o resultado da convesao
    System.out.println("A temperatura informada em Fahrenheit (°F) é igual a: " + tempF + ("°F"));

    input.close();
  }
}






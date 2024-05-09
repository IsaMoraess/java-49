import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/* Cálculo de IMC:
Peça ao usuário para inserir o peso (em kg) e a altura (em metros). Calcule e
mostre o Índice de Massa Corporal (IMC). */
    Scanner sc = new Scanner(System.in);
    System.out.println("Dogite seu peso em kg: ");
    double peso = sc.nextDouble();
    System.out.println("Digite sua altura em metros: ");
    double altura = sc.nextDouble();
    double imc = peso / (altura * altura );
    System.out.println("Seu IMC: " +imc);
    }
}

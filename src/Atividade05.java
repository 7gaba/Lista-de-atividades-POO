import java.util.Scanner;
public class Atividade05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número em metros:");
		double metros = sc.nextDouble();
		double centimetros = metros * 100;
		System.out.printf("O valor em centímetros é: %.2f cm%n", centimetros);
		sc.close();
	}

}

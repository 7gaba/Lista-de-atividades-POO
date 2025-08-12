import java.util.Scanner;
public class atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do quadrado:");
		double altura = sc.nextDouble();
		double area = altura * altura;
		System.out.printf("A área do quadrado é: %.2f cm%n", area);
		sc.close();

	}

}

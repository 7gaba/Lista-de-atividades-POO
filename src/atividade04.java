import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		double n1 = sc.nextInt();
		System.out.println("Digite um numero:");
		double n2 = sc.nextInt();
		System.out.println("Digite um numero:");
		double n3 = sc.nextInt();
		System.out.println("Digite um numero:");
		double n4 = sc.nextInt();
		
		double media = (n1 + n2 + n3 + n4) / 4.0;
		
		System.out.printf("A media dos numeros é: %.2f%n", media);
			
		sc.close();

	}

}

package src;

import java.util.Scanner;

public class atividade08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora? ");
		double valorHora = sc.nextDouble();
		System.out.print("Quantas horas você trabalhou no mês? ");
		double horasMes = sc.nextDouble();
		double salario = valorHora * horasMes;
		System.out.printf("Seu salário no mês é: R$ %.2f\n", salario);
		sc.close();
	}

}
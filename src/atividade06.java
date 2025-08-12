import java.util.Scanner;

public class atividade06 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = SC.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.printf("A área do circulo é: %.2f\n", area);

        SC.close();
    }
}
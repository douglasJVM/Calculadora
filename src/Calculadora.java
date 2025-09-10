import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;

        if (op == '+') {
            resultado = num1 + num2;
        } else if (op == '-') {
            resultado = num1 - num2;
        } else if (op == '*') {
            resultado = num1 * num2;
        } else if (op == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Não é possível dividir por zero.");
                return;
            }
        } else {
            System.out.println("Operação inválida.");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            try {
                // Chamando o método para contagem
                contar(parametroUm, parametroDois);

            } catch (IllegalArgumentException e) {
                // Imprimir a mensagem de exceção
                System.err.println("Erro: " + e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) {
        // Validar se parametroUm é MAIOR que parametroDois e lançar uma exceção se necessário
        if (parametroUm >= parametroDois) {
            throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Realizar o loop for para imprimir os números com base na variável contagem
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

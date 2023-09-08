import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();


        if (nota >= 6) {
            System.out.println("Aluno aprovado!");
            
        }else
        System.out.println("Aluno Reprovado!");

        scanner.close();
}
}
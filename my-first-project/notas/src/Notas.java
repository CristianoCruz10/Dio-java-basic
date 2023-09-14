import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();


        if (nota >= 6) 
            System.out.println("Aluno aprovado!");

        else if (nota >= 5 && nota <7)
            System.out.println("Prova de recuperação");
        
            
        else
        System.out.println("Aluno Reprovado!");

        scanner.close();
}
}
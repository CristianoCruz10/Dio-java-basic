import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*boletim de aluno */
        Scanner sc = new Scanner(System.in);
            System.out.println("digite a nota");
            
        int mediaFinal = sc.nextInt();
        
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("RECUPERAÇÂO");
        else
            System.out.println("APROVADO");
            sc.close();
    }
}


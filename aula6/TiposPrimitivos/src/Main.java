
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Saída de dados:
        float nota = 8.5f;
        String nome = "Carlos";
        System.out.println("A nota é " +  nota);
        System.out.printf("Sua nota é %f \n", nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        nota = 7.5f;
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        // Entrada de dados:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome2 = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota2 = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome2, nota2);

        int idade = 10;
        int idade2;
        System.out.println("Digite a sua idade: ");
        idade2 = teclado.nextInt();
        System.out.println("A sua idade é: " + idade2);
    }
    }

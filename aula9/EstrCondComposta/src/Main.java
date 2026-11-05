import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nascimento;
        int idade;
        System.out.println("Digite o ano de seu nascimento: ");
        nascimento =  sc.nextInt();
        if (nascimento > 2026 || nascimento < 1926) {
            System.out.println("Ano de nascimento inválido");
        } else {
            idade = 2026 - nascimento;
            if (idade >= 18) {
                System.out.println("Você é maior de idade e tem " +  idade + " anos");
            } else {
                System.out.println("Você é menor de idade e tem " +  idade + " anos");
            }
        }
    }
}
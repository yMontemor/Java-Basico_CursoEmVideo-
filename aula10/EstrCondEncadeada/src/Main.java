import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nascimento;
        int idade;
        System.out.println("Digite seu ano de nascimento: ");
        nascimento = sc.nextInt();
        if (nascimento > 2026 || nascimento < 1926){
            System.out.println("Data de nascimento inválida");
        } else {
            idade = 2026 - nascimento;
            System.out.println("Idade: " + idade);
            if (idade < 16){
                System.out.println("Não vota");
            }  else if (idade >= 16 && idade < 18 || idade > 70){
                System.out.println("Voto opcional");
            } else {
                System.out.println("O voto é obrigatório");
            }
        }
    }
}
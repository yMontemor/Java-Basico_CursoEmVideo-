import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n, soma = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: " );
            n = teclado.nextInt();
            soma = soma + n;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equalsIgnoreCase("S"));
        System.out.println("A soma de todos os valores é: " + soma);
    }
}
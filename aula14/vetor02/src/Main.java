import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mes = {
                "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };

        int[] total = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        System.out.println("Digite o ano para descobrir se ele é bissexto (4 dígitos): ");

        while (!sc.hasNextInt()) {
            System.out.println("Você não digitou um número inteiro.");
            sc.next();

            System.out.println("Digite o ano para descobrir se ele é bissexto (4 dígitos): ");
        }

        int ano = sc.nextInt();

        if (ano >= 1000 && ano <= 9999) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                total[1] = 29;
                System.out.println("O ano é bissexto!");
            } else {
                System.out.println("O ano não é bissexto!");
            }

            for (int i = 0; i < mes.length; i++) {
                System.out.println(
                        "O mês de " + mes[i] +
                                " tem " + total[i] +
                                " dias ao todo"
                );
            }

        } else {
            System.out.println("O ano precisa ter 4 dígitos.");
        }
        sc.close();
    }
}
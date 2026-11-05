import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int qntd_num = 0;
        int soma = 0;
        while (qntd_num < 5){
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            soma = soma + numero;
            qntd_num++;
        }
        System.out.println("Soma total: " + soma);

    }
}
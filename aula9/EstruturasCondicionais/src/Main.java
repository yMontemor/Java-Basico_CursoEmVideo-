//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float n1, n2;
        float m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat();
        m = (n1 + n2) / 2;
        System.out.println("A média é: " + m);
        if (m >= 9) {
            System.out.println("Parabéns! ");
        }
    }
}
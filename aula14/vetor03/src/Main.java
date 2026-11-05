import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 8, 4};
        Arrays.sort(num);
        for (int valor: num){ // para cada valor de num, imprima valor;
            System.out.println(valor);

        }
    }
}
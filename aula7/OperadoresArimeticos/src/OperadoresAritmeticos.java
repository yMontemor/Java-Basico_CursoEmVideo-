public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a: " + m);

        int numero = 5;
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        int valor = 5 + numero++;
        System.out.println(valor);
        valor = 5 + ++numero;
        System.out.println(valor);

        int x = 4;
        x += 2; // x = x + 2;
        x -= 2; // x = x - 2;
        x *= 2; // x = x * 2;
        x /= 2; // x = x / 2;

        float v = 8.8f;
        int ar = (int) Math.floor(v); // arredonda para baixo
        System.out.println(ar);
        ar = (int) Math.ceil(v); // arredonda para cima
        System.out.println(ar);
        ar = (int) Math.round(v); // arredonda aritmeticamente
        System.out.println(ar);

        double aleatorio = Math.random();
        System.out.println(aleatorio);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int total = 0;
        int c[] = new int[13];
        for (int i = 0; i<c.length; i++) {
            c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
    }
}
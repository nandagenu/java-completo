import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double y;

        System.out.print("Digite um número: ");
        y = sc.nextDouble();
        System.out.printf("Número digitado: %.2f", y);

        sc.close();
    }
}

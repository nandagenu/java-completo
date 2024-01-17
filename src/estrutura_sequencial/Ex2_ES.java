//Faça um programa para ler o valor do raio de um círculo
//Mostrar o valor da área deste círculo com quatro casas decimais

package estrutura_sequencial;
import java.util.Scanner;
import java.util.Locale;
import static java.lang.Math.pow;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o valor do raio de um círculo: ");
        raio = sc.nextDouble();

        area = 3.14159*pow(raio,2);
        System.out.printf("AREA = %.4f", area);

    }
}

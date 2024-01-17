package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

import static java.lang.System.exit;

public class Ex4_EC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double price=0;

        System.out.print("Qual o código do item a ser comprado, entre 1 a 5? ");
        int cod = sc.nextInt();
        if(cod>5) {
            System.out.println("Código inválido.");
            exit(0);
        }

        System.out.print("Qual a quantidade do item? ");
        int qtd = sc.nextInt();

        price = switch (cod) {
            case 1 -> 4;
            case 2 -> 4.5;
            case 3 -> 5;
            case 4 -> 2;
            case 5 -> 1.5;
            default -> price;
        };

        System.out.print("Total: R$" + qtd*price);

        sc.close();

    }
}

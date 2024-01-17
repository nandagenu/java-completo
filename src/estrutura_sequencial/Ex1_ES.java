// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

package estrutura_sequencial;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        y = sc.nextInt();

        System.out.print("SOMA = " + (x+y));

        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Sorteia número
        int nroSorteado = new Random().nextInt(100);

        Scanner leitura = new Scanner(System.in);

        //Inicia jogo com 5 tentativas
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um número de 0 a 100: ");
            int tentativaUsuario = leitura.nextInt();

            if (tentativaUsuario < nroSorteado) {
                System.out.println("O número digitado é menor que o sorteado!");
            } else if (tentativaUsuario > nroSorteado) {
                System.out.println("O número digitado é maior que o sorteado!");
            } else {
                System.out.println("Parabéns! Você acertou! O número sorteado é " + nroSorteado + "!");
                break;
            }
            if (i == 4) {
                System.out.println("Fim de jogo! Você perdeu! O número correto era " + nroSorteado);
            }
        }
    }
}
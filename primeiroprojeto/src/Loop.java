import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double acumulado = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme:");
            nota = leitura.nextDouble();
            acumulado += nota;
        }

        System.out.println(String.format("Média de avaliações: %.2f ", acumulado / 3));
    }
}

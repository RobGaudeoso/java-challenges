 public class Main {
        public static void main(String[] args) {
            System.out.println("Esse é o RobFlix!");
            System.out.println("Filme: Top Gun: Maverick");

            int anoDeLancamento = 2022;
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            boolean incluidoNoPlano = true;
            double notaDoFilme = 8.1;

            //Média calculada pelas 3 notas dos críticos
            double media = (9.8 + 6.3 + 8.0) / 3;
            System.out.println(media);

            String sinopse = """
                    Top Gun
                    Filme com pilotos de caça da Força Aérea Americana estrelado por Tom Cruise
                    Ano de Lançamento:""" + anoDeLancamento;
            System.out.println(sinopse);

            int classificacao = (int) (media / 2);
            System.out.println("Classificação: " + classificacao);
        }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Saldo cliente
        float saldo = 2500;

        //Imprime dados do cliente
        System.out.println(String.format("""
                ***************************************
                Dados iniciais do cliente:
                
                Nome:               Roberto Gaudeoso
                Tipo de conta:      Corrente
                Saldo inicial:      R$ %.2f
                
                ***************************************
                """, saldo));

        //Scanner para leitura da opção digitada
        Scanner leitor = new Scanner(System.in);

        //seta como 0 o valor inicial do tipo de operação
        int operation = 0;

        //loop enquanto a opção digitada não for 4
        while (operation != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada: """);

            //atribui o número digitado à variável operation
            operation = leitor.nextInt();

            //diferentes operações
            switch (operation) {
                case 1:
                    System.out.println(String.format("Seu saldo atual é R$ %.2f", saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    float valorAReceber =  leitor.nextFloat();
                    saldo += valorAReceber;
                    System.out.println(String.format("Seu saldo atualizado é R$ %.2f", saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor a ser transferido:");
                    float valorATransferir = leitor.nextFloat();
                    if (valorATransferir > saldo) {
                        System.out.println("Não há saldo suficiente para realizar a transferência");
                    } else {
                        saldo -= valorATransferir;
                        System.out.println(String.format("Seu saldo atualizado é R$ %.2f", saldo));
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
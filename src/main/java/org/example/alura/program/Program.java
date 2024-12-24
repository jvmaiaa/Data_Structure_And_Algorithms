    package org.example.alura.program;

    import org.example.alura.poo.Conta;
    import org.example.alura.poo.ItemDaCompra;

    import java.util.Collections;
    import java.util.Locale;
    import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scan = new Scanner(System.in);

            int opcaoPrograma = 0;
            System.out.println("Digite o limite do cartão: ");
            double limiteDoCartao = scan.nextDouble();
            scan.nextLine();
            Conta conta = new Conta(limiteDoCartao);
            do {
                System.out.println("Digite a descrição da compra: ");
                String nomeDoItem = scan.nextLine();
                System.out.println("Digite o valor da compra: ");
                double valorDoItem = scan.nextDouble();
                scan.nextLine();
                ItemDaCompra itemDaCompra = new ItemDaCompra(nomeDoItem, valorDoItem);
                if (valorDoItem > conta.getLimite()) {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Saldo do cartão: " + conta.getLimite());
                    break;
                } else {
                    conta.efetuaCompra(valorDoItem);
                    conta.getItensDaCompra().add(itemDaCompra); // Linha com erro
                    System.out.println("Compra realizada!");
                }
                exibeOpcoes();
                opcaoPrograma = scan.nextInt();
                scan.nextLine();
                if (!(opcaoPrograma == 1 || opcaoPrograma == 0)) {
                    System.out.println("Opção inválida!");
                    break;
                }
            } while (opcaoPrograma == 1);
            Collections.sort(conta.getItensDaCompra());
            for(ItemDaCompra contaAtual : conta.getItensDaCompra()){
                System.out.printf("Item: " + contaAtual.getNomeDoItem() + " Valor do item: %.2f", contaAtual.getValorDoItem());
                System.out.println();
            }
        }

        static void exibeOpcoes(){
            System.out.println("Digite qual opção você deseja escolhe:\n" +
                    "0 - Encerrar programa!\n" +
                    "1 - Continuar programa!");
        }
    }

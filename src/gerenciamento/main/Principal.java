package gerenciamento.main;

import gerenciamento.model.Produto;
import gerenciamento.model.Venda;
import gerenciamento.util.Estoque;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Adicionar produto ao estoque");
            System.out.println("2. Remover produto do estoque");
            System.out.println("3. Realizar venda");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("=== ADICIONAR PRODUTO ===");
                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    float preco = scanner.nextFloat();
                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidadeEstoque = scanner.nextInt();

                    Produto produto = new Produto(id, nome, preco, quantidadeEstoque);
                    estoque.adicionarProduto(produto);
                    System.out.println("Produto adicionado ao estoque.");
                    break;

                case 2:
                    System.out.println("=== REMOVER PRODUTO ===");
                    System.out.print("Digite o ID do produto a ser removido: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Produto produtoRemover = null;
                    for (Produto p : estoque.getListaProdutos()) {
                        if (p.getId() == idRemover) {
                            produtoRemover = p;
                            break;
                        }
                    }

                    if (produtoRemover != null) {
                        estoque.removerProduto(produtoRemover);
                        System.out.println("Produto removido do estoque.");
                    } else {
                        System.out.println("Produto não encontrado no estoque.");
                    }
                    break;

                case 3:
                    System.out.println("=== REALIZAR VENDA ===");
                    System.out.print("Digite o ID da venda: ");
                    int idVenda = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a data da venda: ");
                    String dataVenda = scanner.nextLine();

                    Venda venda = new Venda(idVenda, dataVenda);
                    System.out.print("Digite o ID do produto a ser adicionado à venda (ou -1 para encerrar): ");
                    int idProduto = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    while (idProduto != -1) {
                        Produto produtoVenda = null;
                        for (Produto p : estoque.getListaProdutos()) {
                            if (p.getId() == idProduto) {
                                produtoVenda = p;
                                break;
                            }
                        }

                        if (produtoVenda != null) {
                            venda.adicionarProduto(produtoVenda);
                            System.out.println("Produto adicionado à venda.");
                        } else {
                            System.out.println("Produto não encontrado no estoque.");
                        }

                        System.out.print("Digite o ID do próximo produto (ou -1 para encerrar): ");
                        idProduto = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer
                    }

                    System.out.println("Venda realizada com sucesso.");
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Digite um número válido.");
            }
            System.out.println();
        } while (opcao != 4);

        scanner.close();
    }
}

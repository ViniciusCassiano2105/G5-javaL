package br.com.vidaadultafacil.sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.io.Relatorio;
import br.com.vidaadultafacil.tela_inicial.Produto;

public class MenuAdmin implements MenuInterface  {

	private static Logger logger = Util.setupLogger();
    
    private List<Produto> produtos;

    private Map<String, Runnable> opcoesRelatorio;

    public MenuAdmin() {
        produtos = new ArrayList<>();

        opcoesRelatorio = new HashMap<>();
        opcoesRelatorio.put("I", () -> Relatorio.relatorioAdmin('I'));
        opcoesRelatorio.put("T", () -> Relatorio.relatorioAdmin('T'));
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        logger.info("Produto adicionado com sucesso: " + produto);
    }

    public void removerProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        logger.info("Produto removido com sucesso. ID: " + id);
    }
    @Override
    public void menu() {
        MenuAdmin menuAdmin = new MenuAdmin();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.info("Menu Administrador:");
            logger.info("1. Adicionar Produto");
            logger.info("2. Remover Produto");
            logger.info("3. Gerar Relatório");
            logger.info("4. Sair");
            logger.info("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    logger.info("Digite o ID do produto: ");
                    int idProduto = scanner.nextInt();
                    scanner.nextLine(); 
                    logger.info("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    logger.info("Digite a descrição do produto: ");
                    String descricaoProduto = scanner.nextLine();
                    menuAdmin.adicionarProduto(new Produto(idProduto, idProduto, nomeProduto, descricaoProduto, nomeProduto, null, idProduto));
                    break;
                case 2:
                    logger.info("Digite o ID do produto a ser removido: ");
                    int idRemover = scanner.nextInt();
                    menuAdmin.removerProduto(idRemover);
                    break;
                case 3:
                    logger.info("Digite o tipo de relatório (I para arquivo / T para tela): ");
                    String tipoRelatorio = scanner.nextLine().toUpperCase();
                    Runnable acao = menuAdmin.opcoesRelatorio.get(tipoRelatorio);
                    if (acao != null) {
                        acao.run();
                    } else {
                        logger.warning("Opção inválida.");
                    }
                    break;
                case 4:
                    logger.info("Saindo...");
                    scanner.close();
                    return;
                default:
                    logger.warning("Opção inválida.");
            }
        }
    }
}

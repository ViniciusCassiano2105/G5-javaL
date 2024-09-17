package br.com.vidaadultafacil.sistema;

import java.util.logging.Logger;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.io.Relatorio;
import br.com.vidaadultafacil.tela_inicial.Produto;

public class MenuCliente {

	private static Logger logger = Util.setupLogger();

	public static void main(String[] args) {
		int escolha = 0;
		int opcao2;
		String cliente = "Fulano";  
		Scanner scanner = new Scanner(System.in);

		logger.info("\n\t\tSeja bem-vindo, " + cliente + "!\n");
		logger.info("\n\t\t\tMENU DO CLIENTE\n");
        logger.info("\n\t\tEscolha seu curso e comece viver melhor!\n\t\tPorque viver de miojo é só uma fase... certo?");
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            logger.warning("Erro durante a pausa: " + e.getMessage());
        }

        logger.info("(1) Lista de Produtos");
		logger.info("(2) Avaliação");
		logger.info("(3) Sair");

		while (escolha != 3) {  
			logger.info("Escolha uma opção: ");
			escolha = scanner.nextInt();

			switch (escolha) {
				
			case 1:
				logger.info("Aguenta firme, já vamos te salvar! ;) ");
				logger.info("\n\tProdutos Disponíveis:\n");
				for (Map.Entry<Integer, Produto> prod : Produto.getMapProdutos().entrySet()) {
					Util.setupLogger().log(Level.INFO, 
						"\nNome do Produto: " + prod.getValue().getNome() + 
						"\nDescricao do Produto: " + prod.getValue().getDescricao() + 
						"\nAutor: " + prod.getValue().getAutor() + 
						"\nPreco: " + prod.getValue().getPreco() + 
						"\nDuracao: " + prod.getValue().getDuracao() + "\n\n"
					);
				}
				break;
				
			case 2:			
				logger.info("(1) Visualizar");
				opcao2 = scanner.nextInt();
				Relatorio.relatorioCliente('A');
				break;

				switch (opcao2) {
					case 1:
						logger.info("Aguenta firme, já vamos te salvar! ;) ");
	                    try {
	                        Thread.sleep(6000);
	                    } catch (InterruptedException e) {
	                        logger.warning("Erro durante a pausa: " + e.getMessage());
	                    }
						Relatorio.relatorioCliente('P');
						break;
					default:
						logger.info("Opção inválida!");
				}
				break;
				
			case 3:
				logger.info("Saindo... Volte antes que o caos comece!");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    logger.warning("Erro durante a pausa: " + e.getMessage());
                }
                logger.info("Obrigado por visitar a Easy Adult Life");
				break;
				
			default:
				logger.info("Opção inválida! Por favor, escolha novamente.");
			}
		}
		scanner.close();
	}
}

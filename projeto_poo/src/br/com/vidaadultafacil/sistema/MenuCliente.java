package br.com.vidaadultafacil.sistema;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.io.Relatorio;
import java.util.Scanner;
import java.util.logging.Logger;

public class MenuCliente implements MenuInterface  {

	private static Logger logger = Util.setupLogger();

	@Override
	public void menu() {
		int escolha = 0;
		int opcao2;
		int cliente; 
		int produto;
		Scanner scanner = new Scanner(System.in);

		logger.info("\n\t\tSeja bem-vindo, \n");
		logger.info("\n\t\t\tMENU DO CLIENTE\n");
        logger.info("\n\t\tEscolha seu curso e comece viver melhor!\n\t\tPorque viver de miojo e so uma fase... certo?");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.warning("Erro durante a pausa: " + e.getMessage());
        }

		while (escolha != 3) {  
			logger.info("\n(1) Lista de Produtos");
			logger.info("(2) Avaliacao");
			logger.info("(3) Sair");
			logger.info("Escolha uma opcao: ");
			escolha = scanner.nextInt();

			switch (escolha) {
				
			case 1:
				logger.info("\n\tProdutos Disponiveis:\n");
				Relatorio.relatorioCliente('P');
				logger.info("\n\n\t\tDeseja comprar algum produto?\n");
				logger.info("(1) Sim\n(2) Nao");
				logger.info("Escolha uma opcao: ");
				opcao2 = scanner.nextInt();

				/*if (opcao2 == 1) {
					logger.info("Escolha o produto que deseja comprar: ");
					produto = scanner.nextInt();
					Carrinho carrinho = new Carrinho(produto, cliente);
					Carrinho.adicionarProduto(produto);
				}*/

				break;
				
			case 2:			
					logger.info("Aguenta firme, ja vamos te salvar!) ");
	                try {
	                    Thread.sleep(3000);
						Relatorio.relatorioCliente('A');
	                } catch (InterruptedException e) {
	                    logger.warning("Erro durante a pausa: " + e.getMessage());
	                }
				break;
				
			case 3:
				logger.info("Saindo... Volte antes que o caos comece!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    logger.warning("Erro durante a pausa: " + e.getMessage());
                }
                logger.info("\n\t\tObrigado por visitar a Easy Adult Life\n\n");
				break;
				
			default:
				logger.info("Opcao invalida! Por favor, escolha novamente.\n\n");
			}
		}
		scanner.close();
	}
}

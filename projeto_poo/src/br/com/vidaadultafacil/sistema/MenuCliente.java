package br.com.vidaadultafacil.sistema;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.io.Relatorio;
import java.util.Scanner;
import java.util.logging.Logger;

public class MenuCliente {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {
		int escolha = 0;
		int opcao2;
		Scanner scanner = new Scanner(System.in);

		logger.info("\n\t\t\tMENU DO CLIENTE\n");
		logger.info("(1) Visualizar Produtos Disponíveis");
		logger.info("(2) Sair");

		while (escolha != 2) {
			switch (escolha) {
				
			case 1:
				logger.info("(1) Visualizar impresso: ");
				logger.info("(2) Visualizar digital: ");
				opcao2 = scanner.nextInt();

				switch (opcao2){
					case 1:
						Relatorio.relatorioCliente();
						break;
					case 2:
						
						break;
				}
				break;
			case 2:
				break;
			default:
           	logger.info("Opção inválida! Por favor, escolha novamente.");
			}
		scanner.close();  
		}
	}
}
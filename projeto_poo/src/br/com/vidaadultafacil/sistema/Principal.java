package br.com.vidaadultafacil.sistema;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.usuarios.Cliente;


public class Principal {
	
	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);

		logger.info("\n\t\t\t EASY ADULT LIFE\n\t\t\t-------------------\n\tTornando a vida independente descomplicada e acessível!\n");
		logger.info("Digite como gostaria de ser chamado(a):");
		String nome = sc.next();
		String mensagemBemvindo = String.format("Bem vindo(a) %s você deseja acessar o sistema como CLIENTE ou ADMINISTRADOR?\n",nome);
		logger.info(mensagemBemvindo);
		logger.info("\n(1) CLIENTE\n(2) ADMINISTRADOR");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				logger.info("\n(1) Acessar sua conta\n(2) Cadastro");
				int opcaoCliente = sc.nextInt();

				switch (opcaoCliente) {
					case 1:
						logger.info("\nVocê escolheu acessar sua conta.\nAguarde");
						Thread.sleep(6000);
						Relatorio.write("Banco", Cliente.class);
						break;
					case 2:
						System.out.println("\n\nVocê escolheu se cadastrar.\nAguarde");
						Thread.sleep(6000);
						//continuacao de acesso a conta ...
						//criar map para mostrar lista de produtos
						break;
					default:
						System.out.println("Opção inválida.");
						break;
				}
				break;

			case 2:

				logger.info("Você escolheu acessar o sistema como administrador.");
				//continuacao de acesso como administrador ...
				break;

			default:
				logger.info("Opção inválida.");
				break;
		}

		sc.close();
    }
}
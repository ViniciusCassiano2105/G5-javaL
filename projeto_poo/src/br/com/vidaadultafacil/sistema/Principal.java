package br.com.vidaadultafacil.sistema;

import br.com.vidaadultafacil.usuarios.Cliente;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao Vida Adulta Fácil!\n\n");

		System.out.println("Você deseja acessar o sistema como cliente ou administrador?\n");
		System.out.println("Digite 1 para cliente e 2 para administrador.");
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:

				System.out.println("\n\nVocê escolheu acessar o sistema como cliente.\n");

				System.out.println("Deseja se cadastrar ou acessar sua conta?\n\n");
				System.out.println("Digite 1 para se cadastrar e 2 para acessar sua conta.");
				int opcaoCliente = sc.nextInt();

				switch (opcaoCliente) {
					case 1:
						System.out.println("\n\nVocê escolheu se cadastrar.\n");
						Relatorio.write("Banco", Cliente.class);
						break;
					case 2:
						System.out.println("\n\nVocê escolheu acessar sua conta.\n");
						//continuacao de acesso a conta ...
						//criar map para mostrar lista de produtos
						break;
					default:
						System.out.println("Opção inválida.");
						break;
				}
				break;

			case 2:

				System.out.println("Você escolheu acessar o sistema como administrador.");
				//continuacao de acesso como administrador ...
				break;

			default:
				System.out.println("Opção inválida.");
				break;
		}

		try {
			LeitorArquivo.leitor("Banco");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
    }
}
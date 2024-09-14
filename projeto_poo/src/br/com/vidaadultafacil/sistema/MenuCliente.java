package br.com.vidaadultafacil.sistema;

import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

import java.util.Scanner;

public class MenuCliente {

	private static Logger logger = Logger.getLogger(Util.class.getName());

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);


		logger.info("\n\t\t\tMENU DO CLIENTE\n");
		logger.info("(1) Visualizar Produtos Disponíveis");
		logger.info("(2) Sair");
	
		
	}
}

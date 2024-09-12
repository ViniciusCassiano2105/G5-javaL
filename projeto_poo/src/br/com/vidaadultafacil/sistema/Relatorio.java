package br.com.vidaadultafacil.sistema;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
import java.util.logging.Level;

import br.com.aula_poo.utils.Util;

public class Relatorio {
	
	static final String PATH_BASICO = "./projeto_poo/temp/";
	public static void escritor(String path) throws IOException {

		Scanner sc = new Scanner(System.in);
		Util.setupLogger().log(Level.INFO, "Escreva o nome do arquivo: ");
		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + path));
		String linha = "";

		Util.setupLogger().log(Level.INFO, "Escreva algo:");
		linha = sc.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	
	}
}
package br.com.vidaadultafacil.sistema;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.io.EscritorArquivo;
import br.com.vidaadultafacil.io.LeitorArquivo;
import br.com.vidaadultafacil.usuarios.Administrador;
import br.com.vidaadultafacil.usuarios.CadastroNovo;
import br.com.vidaadultafacil.usuarios.Usuario;


public class Principal {

	
	public static void main(String[] args) throws InterruptedException {
		
		LeitorArquivo.leitor("Banco");
		Menu menu = new Menu();
		menu.menu();
	}
}
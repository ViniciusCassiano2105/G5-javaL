package br.com.vidaadultafacil.sistema;

import br.com.vidaadultafacil.io.LeitorArquivo;
import br.com.vidaadultafacil.usuarios.Cliente;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {

		try {
			LeitorArquivo.leitor("Banco");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Relatorio.write("banco.txt", Cliente.class);
    }
}
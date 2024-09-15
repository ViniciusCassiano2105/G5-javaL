package br.com.vidaadultafacil.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.com.vidaadultafacil.pedidos.Carrinho;
import br.com.vidaadultafacil.pedidos.CarrinhoProduto;
import br.com.vidaadultafacil.usuarios.Administrador;
import br.com.vidaadultafacil.usuarios.Cliente;

public class LeitorArquivo{

	static final String PATH_BASICO = "src/temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		try (BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO))) {
			String linha;
			while ((linha = buffRead.readLine()) != null) {
				String [] dados = linha.split(";");

				switch (dados[0]){
					case "Cliente":
						Cliente cliente = new Cliente(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5], dados[6]);
						Cliente.getMapClientes().put(cliente.getId(), cliente);
						break;
					case "Administrador":
						Administrador admin = new Administrador(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5], Boolean.parseBoolean(dados[6]));
						Administrador.getMapAdmin().put(admin.getId(), admin);
						break;
					case "Carrinho":
						Carrinho carrinho = new Carrinho(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]));
						Carrinho.getMapCarrinho().put(carrinho.getIdCarrinho(), carrinho);
						break;
					case "CarrinhoProduto":
						CarrinhoProduto carrinhoProduto = new CarrinhoProduto(Integer.parseInt(dados[1]), Integer.parseInt(dados[2]),Integer.parseInt(dados[3]));
						CarrinhoProduto.getMapCarrinhoProdutos().put(carrinhoProduto.getFKCarrinho(), carrinhoProduto);
						break;
					case "HistoricoCompra":	
				}		
			}
		}
	}
}
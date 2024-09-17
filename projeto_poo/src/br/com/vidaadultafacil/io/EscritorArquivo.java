package br.com.vidaadultafacil.io;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

import br.com.vidaadultafacil.tela_inicial.Produto;
import br.com.vidaadultafacil.usuarios.Cliente;

public class EscritorArquivo {

    private static final String CAMINHO_ARQUIVO = "temp/banco.txt";
    private static final Set<Integer> idsExistentes = new HashSet<>();

    // Carrega os IDs existentes do arquivo de banco (tanto de clientes quanto de produtos)
    public static void carregarIdsDoArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length > 1) {
                    int id = Integer.parseInt(dados[1]);  // O ID está no índice 1 da linha formatada
                    idsExistentes.add(id);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar IDs do arquivo: " + e.getMessage());
        }
    }

    // Gera um ID único
    public static int gerarIdUnico() {
        int novoId = idsExistentes.size() + 1;
        while (idsExistentes.contains(novoId)) {
            novoId++;
        }
        idsExistentes.add(novoId);
        return novoId;
    }

    // Salva o cadastro de cliente ou produto no arquivo .txt
    public static void salvarCadastroEmArquivo(String tipo, String linhaCadastro) {
        try (FileWriter fw = new FileWriter(CAMINHO_ARQUIVO, true);
             PrintWriter pw = new PrintWriter(fw)) {

            // Salva no formato: "TIPO;dados do cadastro"
            pw.println(tipo + ";" + linhaCadastro);

            System.out.println("Informações foram salvas no arquivo " + CAMINHO_ARQUIVO);
        } catch (IOException e) {
            System.out.println("Erro ao salvar as informações no arquivo: " + e.getMessage());
        }
    }

	public static void salvarCadastroClienteEmArquivo(Cliente novoCliente) {
		// TODO Auto-generated method stub
		
	}

	public static void salvarCadastroProdutoEmArquivo(Produto novoProduto) {
		// TODO Auto-generated method stub
		
	}
}

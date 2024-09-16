package br.com.vidaadultafacil.io;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.tela_inicial.Avaliacao;
import br.com.vidaadultafacil.tela_inicial.Produto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

public class Relatorio {

	public static void relatorioCliente(char op){

        String nome = "relatorio_Cliente";
		Scanner sc = new Scanner(System.in);

        try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(LeitorArquivo.PATH_BASICO + nome + LeitorArquivo.EXTENSAO, true));

				Util.setupLogger().log(Level.INFO, "\tMenu\n[P]Produtos\t[A]Avaliacoes\n");
				char op2 = sc.next().charAt(0);
				
				if (op2 == 'P') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for (Map.Entry<Integer, Produto> prod : Produto.getMapProdutos().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Produto: " + prod.getValue().getNome() + "\nDescricao do Produto: " + prod.getValue().getDescricaoProd() + "\nAutor: " + prod.getValue().getAutor() + "\nPreco: " + prod.getValue().getPreco() + "\nDuracao: " + prod.getValue().getDuracao() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");

				} else if (op2 == 'A') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Avaliacao> aval : Avaliacao.getMapAvaliacao().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNota: " + aval.getValue().getNota() + "\nComentario: " + aval.getValue().getComentario() + "\nUsuario: " + aval.getValue().getUsuario() + "\nProduto: " + aval.getValue().getFkProduto() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");
				}

		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static void relatorioAdmin(char op){

        String nome = "relatorio_admin";
        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(LeitorArquivo.PATH_BASICO + nome + LeitorArquivo.EXTENSAO, true));

            if(op == 'T'){

            } else if(op == 'I'){

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }	
}
package br.com.vidaadultafacil.io;

import br.com.aula_poo.utils.Util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

public class LeitorArquivo{

		static final String PATH_BASICO = "src/temp/";
		static final String EXTENSAO = ".txt";

		public static void leitor(String path) throws IOException {
			System.out.println("Working Directory = " + System.getProperty("user.dir"));
			BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
			String linha;
			
			while (((linha = buffRead.readLine()) != null)) {
				Util.setupLogger().log(Level.INFO, linha);
			}

			buffRead.close();
		}
	}


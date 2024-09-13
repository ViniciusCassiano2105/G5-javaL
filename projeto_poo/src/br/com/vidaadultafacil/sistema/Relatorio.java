package br.com.vidaadultafacil.sistema;

import br.com.vidaadultafacil.usuarios.Cliente;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Relatorio {
	
	static final String PATH_BASICO = "./temp/";
    static final String EXTENSAO = ".txt";
	public static void write(String file, Class<?> tClass) {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_BASICO + file +EXTENSAO, true))) {


           
            Scanner sc = new Scanner(System.in);

            switch (tClass.getSimpleName()) {
                case "Cliente":
                    System.out.println("Digite o nome do usuário: ");
                    String nome = sc.next();
                    System.out.println("Digite o email do usuário");
                    String email = sc.next();
					System.out.println("Digite a senha do usuário");
					String senha = sc.next();
					System.out.println("Digite o telefone do usuário");
					String telefone = sc.next();
					System.out.println("Digite o cpf do usuário");
					String cpf = sc.next();
                    Cliente cliente = new Cliente(nome, email, senha, telefone, cpf);
                    cliente.setNome(nome);
                    cliente.setEmail(email);
					cliente.setSenha(senha);
					cliente.setTelefone(telefone);
					cliente.setCpf(cpf);
                    writer.write(cliente.toDbLine());
                    break;
                case "Admin":
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
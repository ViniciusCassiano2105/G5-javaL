package br.com.vidaadultafacil.usuarios;

import br.com.vidaadultafacil.io.EscritorArquivo;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CadastroNovo {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";

    // Valida o formato do e-mail
    public static boolean validarEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    // Valida o CPF 
    public static boolean validarCpf(String cpf) {
        String cpfNumeros = cpf.replaceAll("\\D", ""); // Remove qualquer não número
        return cpfNumeros.length() == 11;
    }

    // Cria um novo cadastro de cliente
    public String criarCadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de novos clientes!");

        // Carregar IDs existentes antes de gerar um novo
        EscritorArquivo.carregarIdsDoArquivo();

        String nome;
        String email = null; 
        String senha;
        String telefone; 
        String cpf;

        // Entrada do nome
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        // Validação de email
        do {
            System.out.print("Digite seu e-mail: ");
            email = scanner.nextLine();

            if (!validarEmail(email)) {
                System.out.println("E-mail inválido. Por favor, insira um e-mail válido.");
            } else if (Cliente.getMapClientes().containsKey(email)) {
                System.out.println("Este e-mail já está cadastrado. Por favor, use outro e-mail.");
                email = null;
            }
        } while (email == null || !validarEmail(email));

        // Entrada da senha
        System.out.print("Digite uma senha: ");
        senha = scanner.nextLine();

        // Entrada do telefone
        System.out.print("Digite seu telefone: ");
        telefone = scanner.nextLine();

        // Validação do CPF
        do {
            System.out.print("Digite seu CPF (apenas números): ");
            cpf = scanner.nextLine();

            if (!validarCpf(cpf)) {
                System.out.println("CPF inválido. Deve conter exatamente 11 dígitos.");
            }
        } while (!validarCpf(cpf));

        // Gera um ID único
        int novoId = EscritorArquivo.gerarIdUnico();

        // Cria um novo cliente com o ID gerado e adiciona ao mapa de clientes
        Cliente novoCliente = new Cliente(novoId, nome, email, senha, telefone, cpf);
        Cliente.getMapClientes().put(email, novoCliente);
        
        
        System.out.println("Cadastro realizado com sucesso! Seu ID é: " + novoId);
        
        // Salva o cadastro no arquivo txt
        EscritorArquivo.salvarCadastroClienteEmArquivo(novoCliente);

        scanner.close();  // Fechar o scanner após o uso
        String cl = "Cliente;" + novoId+";"+ nome+";"+ email+";"+ senha+";"+ telefone+";"+ cpf;
        return cl;
    }
}

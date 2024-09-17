package br.com.vidaadultafacil.usuarios;

import java.util.Scanner;
import java.util.regex.Pattern;

import br.com.vidaadultafacil.io.EscritoArquivo;
import br.com.vidaadultafacil.tela_inicial.Produto;

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
    public static Cliente criarCadastro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de novos clientes!");

        EscritoArquivo.carregarIdsDoArquivo();  // Carregar IDs existentes antes de gerar um novo

        String nome, email, senha, telefone, cpf;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        do {
            System.out.print("Digite seu e-mail: ");
            email = scanner.nextLine();

            if (!validarEmail(email)) {
                System.out.println("E-mail inválido. Por favor, insira um e-mail válido.");
            }
            if (Cliente.getMapClientes().containsKey(email)) {
                System.out.println("Este e-mail já está cadastrado. Por favor, use outro e-mail.");
                email = null;
            }
        } while (email == null || !validarEmail(email));

        System.out.print("Digite uma senha: ");
        senha = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        telefone = scanner.nextLine();

        do {
            System.out.print("Digite seu CPF (apenas números): ");
            cpf = scanner.nextLine();

            if (!validarCpf(cpf)) {
                System.out.println("CPF inválido. Deve conter exatamente 11 dígitos.");
            }
        } while (!validarCpf(cpf));

        // Gera um ID único 
        int novoId = EscritoArquivo.gerarIdUnico();

        // Cria um novo cliente com ID único e adiciona ao mapa de clientes
        Cliente novoCliente = new Cliente(novoId, nome, email, senha, telefone, cpf);
        Cliente.getMapClientes().put(email, novoCliente);

        System.out.println("Cadastro realizado com sucesso! Seu ID é: " + novoId);

        // Salva o cadastro no arquivo txt
        EscritoArquivo.salvarCadastroClienteEmArquivo(novoCliente);

        return novoCliente;
    }

    // Cadastro de novos produtos pelo administrador
    public static Produto cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de novos produtos");

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a duração do produto (em horas): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        System.out.print("Digite o autor do produto: ");
        String autor = scanner.nextLine();

        // Gera um ID único
        int novoId = EscritoArquivo.gerarIdUnico();

        // Cria um novo produto
        Produto novoProduto = new Produto(novoId, nome, descricao, preco, duracao, autor);

        // Salva o produto no arquivo txt
        EscritoArquivo.salvarCadastroProdutoEmArquivo(novoProduto);

        System.out.println("Produto cadastrado com sucesso! ID do produto: " + novoId);

        return novoProduto;
    }
}

package br.com.vidaadultafacil.sistema;

import br.com.vidaadultafacil.usuarios.Administrador;
import br.com.vidaadultafacil.usuarios.Cliente;

public class Principal {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("Lucas Silva", "Lucas@gmail.com", "senha321", "(21) 99999-9999", "111.111.111-11");
        
        // Criando um admin
        Administrador admin = new Administrador("Maria Admin", "maria.admin@gmail.com", "adminsenha", "45648791" ,true);
        
        System.out.println(cliente);
        System.out.println(admin);
    } 
}
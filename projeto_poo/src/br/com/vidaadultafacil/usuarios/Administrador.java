package br.com.vidaadultafacil.usuarios;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;

public class Administrador extends Usuario {
	private static Logger logger = Util.setupLogger();
	
    // Chave primária
    private int id;
    private boolean isAdmin;
    private static final Map<String, Administrador> admins = new HashMap<>();

    public Administrador(int id, String nome, String email, String senha, String telefone, boolean isAdmin) {
        super(nome, email, senha, telefone);
        this.id = id;
        this.isAdmin = isAdmin;
        admins.put(email, this); 
    }

    public Administrador(String nome, String email, String senha, String telefone, boolean isAdmin) {
        super(nome, email, senha, telefone);
        this.id = admins.size() + 1;
        this.isAdmin = isAdmin;
        admins.put(email, this); 
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public int getId() {
        return id;
    }

    public static Map<String, Administrador> getMapAdmin() {
        return admins;
    }
    // realizar login
    public static Administrador login(String email, String senha) {
        Administrador admin = admins.get(email);
        if (admin != null && admin.getSenha().equals(senha)) {
            logger.info("Login bem-sucedido!");
            return admin;
        } else {
            logger.info("Credenciais inválidas!");
            return null;
        }
    }

    public String toDbLine() {
        return String.format("Administrador;%s;%s;%s;%s;%b\n", this.nome, this.email, this.senha, this.telefone, this.isAdmin);
    }

    @Override
    public String toString() {
        return "Admin{" + "nome='" + getNome() + '\'' + ", email='" + getEmail() + '\'' + ", isAdmin=" + isAdmin + '}';
    }
}

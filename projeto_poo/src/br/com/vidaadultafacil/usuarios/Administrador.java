package br.com.vidaadultafacil.usuarios;

public class Administrador extends Usuario {
		// Chave primária
		private int id;
	
		boolean isAdmin;

		public Administrador(String nome, String email, String senha, String telefone, boolean isAdmin) {
			super(nome, email, senha, telefone);
			this.isAdmin = isAdmin;
		}

		public boolean getisAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean admin) {
			isAdmin = admin;
		}
		
		public int getIdAdm() {
			return id;
		}

		public void setIdAdm(int id) {
			this.id = id;
		}

		public String toString() {
			return "Admin{" +
					"nome='" + getNome() + '\'' +
					", email='" + getEmail() + '\'' +
					", isAdmin=" + isAdmin +
					'}';
		}
}

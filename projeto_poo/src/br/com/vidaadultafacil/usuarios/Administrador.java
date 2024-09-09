package br.com.vidaadultafacil.usuarios;

public class Administrador extends Usuario {
		// Chave primária
		private int fk_id_usuario;
	
		boolean isAdmin;

		public Administrador(int fk_id_usuario, String nome, String email, String senha, String telefone, boolean isAdmin) {
			super(fk_id_usuario, nome, email, senha, telefone);
			this.isAdmin = isAdmin;
		}

		public boolean getisAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean admin) {
			isAdmin = admin;
		}
		
		public int getFk_id_usuario() {
			return fk_id_usuario;
		}

		public void setFk_id_usuario(int id) {
			this.fk_id_usuario = fk_id_usuario;
		}

		public String toString() {
			return "Admin{" +
					"nome='" + getNome() + '\'' +
					", email='" + getEmail() + '\'' +
					", isAdmin=" + isAdmin +
					'}';
		}
}
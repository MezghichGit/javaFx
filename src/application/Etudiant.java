package application;

public class Etudiant {
	String nom;
	String email;
	String ville;
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", email=" + email + ", ville=" + ville + "]";
	}

	public Etudiant(String nom, String email, String ville) {
		this.nom = nom;
		this.email = email;
		this.ville = ville;
	}
}

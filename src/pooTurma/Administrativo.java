package pooTurma;

public class Administrativo extends Senac {
	String emailCorporativo;
	String redeDominio;
	
	public Administrativo() {
		System.out.println("Dados Pessoais");
	}
	
	void registrarPonto() {
		System.out.println("Ponto registrado no sistema");
	}
	
	void imprimirHolerite() {
		System.out.println("Holerite impresso!");
	}
	
	void abrirChamadoSuporte() {
		System.out.println("Luis, compuatdor parou de funcionar!");
	}
	
	public void acessarSistema() {
		if (redeDominio == "sp@senac.br") {
			logar();
			
		}
		
		else {
			System.out.println("Login não realizado. Tente novamente, " + nome + ".");
		}
		
		
	}

}

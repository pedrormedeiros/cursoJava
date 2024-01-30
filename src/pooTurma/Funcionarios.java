package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
		
		Administrativo funcionario1 = new Administrativo();
		funcionario1.nome = "Carlos";
		funcionario1.emailCorporativo = "carlos@sp.senac.br";
		funcionario1.redeDominio = "sp@senac.br";
		funcionario1.acessarSistema();
		
		Administrativo funcionario2 = new Administrativo();
		funcionario2.nome = "Joelma";
		funcionario2.emailCorporativo = "joelma@sesi.com.br";
		funcionario2.redeDominio = "@sesi.com.br";
		funcionario2.acessarSistema();
		
		

	}

}

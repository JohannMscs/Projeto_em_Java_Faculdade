public class Tudo {

	public static void main(String [] args) {
	    Pessoa identidade1 = new Pessoa("144.455.6", "jose");
		identidade1.imprimir();
		
		PessoaEmpresa pessoa1 = new PessoaEmpresa();
		pessoa1.entradaDados();
		pessoa1.imprimir();
		
		Gerente gerente = new Gerente();
		gerente.entradaDados();
		gerente.imprimir();
		
		Cliente cliente = new Cliente();
		cliente.entradaDados();
		cliente.imprimir();
		
		Funcionario funcionario = new Funcionario();
		funcionario.entradaDados();
		funcionario.imprimir();
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.entradaDados();
		funcionario2.imprimir();
	}
	
}
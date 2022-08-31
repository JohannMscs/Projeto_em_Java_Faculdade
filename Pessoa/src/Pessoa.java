
public class Pessoa {
		String nome, identidade;
		int idade;
		public Pessoa(String nome, String identidade, int idade) {
			setNome(nome);
			setIdentidade(identidade);
			setIdade(idade);
		}
		public String getNome () {
			return nome;
		}
		public void setNome(String nm) {
			if(!nm.isEmpty()) {
				nome = nm;
			}
		}
		public String getIdentidade() {
			return identidade;
		}
		public void setIdentidade(String id) {
			if(!id.isEmpty()) {
				identidade = id;
			}
		}
		public int getIdade() {
		    return idade;
			}
		public void setIdade( int dd) {
			if(dd>0) {
				idade = dd;
			}
		}
		public void imprimir() {
			System.out.println("Pessoa:");
			System.out.println("Nome:" + nome);
			System.out.println("Identidade" + identidade);
			System.out.println("Idade=" + idade);

		}
		}

	
		
	


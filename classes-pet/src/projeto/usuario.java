package projeto;


	import java.util.Scanner;

	


	// Classe cliente  a entrada e nome , email senha 
	//pra que o usuario entre com sucesso.



	public class usuario {

		private String nome;
		private String email;
		private int senha;
		
		public void nome() {
			this.nome= nome;
		}
		
		public void entraEmail() {
			this.email=email;
		}
		
		public void entraSenha() {
			this.senha=senha;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getSenha() {
			return senha;
		}

		public void setSenha(int senha) {
			this.senha = senha;
			 
				
		}
		
		public static void main(String[]args) {
			
			Scanner sc= new Scanner(System.in);
			  System.out.println("Entra com nome");
		    String nome =sc.nextLine();

		    System.out.println("entra com email");
			String email =sc.nextLine();

		     System.out.println("entra com a senha");
		       int senha =sc.nextInt();
		     
		     System.out.println("sucesso");

		}

		}
		


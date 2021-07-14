package projeto;

	import java.util.Scanner;

	//Classe cliente, requer iformaçaão do cliente pra entra no sistema 
	//direcionado, como por exemplo nome animal o que vai faz e a entrada
	//dara sucesso.




	public class Cliente {
		
		public static void main(String[]args) {
		
			Scanner sc= new Scanner(System.in);
			  System.out.println("Entra o nome do cliente");
		    String cliente =sc.nextLine();

		    System.out.println("animal do cliente");
			String animal =sc.nextLine();
	  
		     System.out.println("Vai fazer o que ?");
		       String vai =sc.nextLine();
		     
		     System.out.println("emtrada com  sucesso");
		
		}
}

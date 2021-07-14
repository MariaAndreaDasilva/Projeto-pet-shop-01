package Projeto01;

import java.util.Scanner;

public class Animal {


    private String cão;
    private String gato;
    private String outros;
    
    
    public void consulta() {
    	this.cão=cão;
    }
    
    public void vacinação() {
    	this.gato=gato;
    	
    }
     public void resultado() {
    	 this.outros=outros;
     }

	public String getCão() {
		return cão;
	}

	public void setCão(String cão) {
		this.cão = cão;
	}

	public String getGato() {
		return gato;
	}

	public void setGato(String gato) {
		this.gato = gato;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}
    	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		  System.out.println("ANIMAL");
	    String cão =sc.nextLine();
	    
	
	 System.out.println("vacinação");
	    String gato =sc.nextLine();
    	
    

        System.out.println("resultado");
          String outros  =sc.nextLine();
          
           
       	   
           
	
          System.out.println("sucesso");
          String negativo =sc.nextLine();
          
	}
	
}


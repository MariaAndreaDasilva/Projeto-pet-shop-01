package Projeto01;

import java.util.Scanner;

public class Animal {


    private String c�o;
    private String gato;
    private String outros;
    
    
    public void consulta() {
    	this.c�o=c�o;
    }
    
    public void vacina��o() {
    	this.gato=gato;
    	
    }
     public void resultado() {
    	 this.outros=outros;
     }

	public String getC�o() {
		return c�o;
	}

	public void setC�o(String c�o) {
		this.c�o = c�o;
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
	    String c�o =sc.nextLine();
	    
	
	 System.out.println("vacina��o");
	    String gato =sc.nextLine();
    	
    

        System.out.println("resultado");
          String outros  =sc.nextLine();
          
           
       	   
           
	
          System.out.println("sucesso");
          String negativo =sc.nextLine();
          
	}
	
}


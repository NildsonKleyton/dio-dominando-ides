package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		//syso ctrl + barra
		System.out.println("Olá, Mundo!");
		int soma = 1 + 2 ;
		//sysout ctrl + barra
		System.out.println("A soma de  1 + 2 = " + soma);
		//nova instância
		Gato gato = new Gato("Mishu", "marro", 3);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros.nome = "Java EE");
	}
}

class Livros{
	public String nome;
	private String numeroDePagina;
	
}

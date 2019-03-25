package br.com.alura.java8;

public class TestaModificadorProtected {
	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.id = 10;
		curso.nome = "teste";
		
		
		System.out.println(curso);
		
	}
}

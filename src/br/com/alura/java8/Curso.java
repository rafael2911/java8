package br.com.alura.java8;

public class Curso {
	
	protected int id;
	protected String nome;
	
	public Curso() {}
	
	public Curso(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + "]";
	}
	
}

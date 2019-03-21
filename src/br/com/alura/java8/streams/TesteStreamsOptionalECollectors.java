package br.com.alura.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteStreamsOptionalECollectors {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		cursos.add(new Curso("Java OO", 72));
		
		// Possui metodos auxiliares que evitam erros como NullPointerException ou NoSuchElementException
		// erros ao trabalhar com objetos nulos
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.map(Curso::getNome)
			.findAny()
			.ifPresent(System.out::println);
		
		// dessa forma seria lançada uma exceção caso o elemento não fosse encontrado
		// System.out.println(optionalCurso.get().getNome());
		
		
		// Transformar a stream de volta em uma lista
		List<Curso> novosCursos = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toList());
		
		System.out.println("");
		System.out.println("Listando nova lista com cursos filtrados");
		novosCursos.forEach(c -> System.out.println(c.getNome()));
		
		// Transformar a stream em um map
		Map<String, Integer> cursosMap = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));
			
			System.out.println("");
			System.out.println("Listando mapa com cursos filtrados");
			System.out.println(cursosMap);
			System.out.println("ou");
			cursosMap.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos +" Alunos"));
	}
}

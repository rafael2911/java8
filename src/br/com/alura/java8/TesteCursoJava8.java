package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesteCursoJava8 {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(1, "Java 8"));
		cursos.add(new Curso(2, "Programação Orientada a Objetos"));
		cursos.add(new Curso(3, "Iniciando com C#"));
		cursos.add(new Curso(4, "PHP7"));
		cursos.add(new Curso(5, "PHP: do procedural a O.O."));
		cursos.add(new Curso(6, "Api Restful com jax-rs"));
		cursos.add(new Curso(7, "Desbravando o python com Jango"));
		cursos.add(new Curso(8, "Hibernate"));
		
		//cursos.forEach(System.out::println);
		
		//cursos.stream().map(Curso::getNome).forEach(System.out::println);
		
		/*
		Map<Integer, String> mapCurso = cursos.stream().collect(Collectors.toMap(Curso::getId, Curso::getNome));
		mapCurso.forEach((i, n) -> System.out.println(i + " - " + n));
		*/
		
		System.out.println("Filtrando com o trecho PHP");
		cursos.stream().filter(c -> c.getNome().contains("PHP")).forEach(System.out::println);
		
//		System.out.println("");
//		System.out.println("Ordenando por tamanho da string");
//		cursos.sort(Comparator.comparingInt(c -> c.getNome().length()));
//		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("");
		System.out.println("Outra forma de ordenar pelo tamanho da string");
		cursos.stream()
			.map(Curso::getNome)
			.sorted(Comparator.comparingInt(String::length))
			.forEach(System.out::println);
		
		
	}
	
}

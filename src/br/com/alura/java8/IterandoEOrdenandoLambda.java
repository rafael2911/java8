package br.com.alura.java8;

import java.util.ArrayList;
import java.util.List;

public class IterandoEOrdenandoLambda {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>();
		strings.add("Iniciando com o java 8!");
		strings.add("Bem vindo...");
		strings.add("Ola");
		strings.add("Seja bem vindo");
		strings.add("UCD");
		strings.add("Unimed");

		System.out.println(strings);

		// aplicamdo lambda expressions
		strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// aplicamdo lambda expressions
		strings.forEach(s -> System.out.println(s));

	}

}

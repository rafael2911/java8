package br.com.alura.java8;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Function;

public class IterandoEOrdenandoMethodReference {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		strings.add("Iniciando com o java 8!");
		strings.add("Bem vindo...");
		strings.add("Ola");
		strings.add("Seja bem vindo");
		strings.add("UCD");
		strings.add("Unimed");

		System.out.println(strings);

		// usando o comparing (metodo statico da interface comparator)
		// strings.sort(Comparator.comparing(s -> s.length()));
		
		
		// o metodo comparing recebe um Function, que recebe uma string e retorna um integer
		// Function<String, Integer> funcao = s -> s.length();
		// strings.sort(Comparator.comparing(funcao));
		
		// usando method reference do java 8
		// strings.sort(Comparator.comparing(String::length));
		
		// usando method reference com import statico
		strings.sort(comparing(String::length));
		
		// usando outro parametro de ordenação
		strings.sort(String.CASE_INSENSITIVE_ORDER);
		
		

		// aplicamdo lambda expressions
		// strings.forEach(s -> System.out.println(s));
		
		// usando method referenteces para imprimir os valores do foreach
		strings.forEach(System.out::println);
		
	}
	
}

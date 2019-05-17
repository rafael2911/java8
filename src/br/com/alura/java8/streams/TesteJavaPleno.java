package br.com.alura.java8.streams;

import java.util.stream.Stream;

public class TesteJavaPleno {
	public static void main(String[] args) {
		
		Stream.of("a1", "b2", "a2", "b2", "c1")
			.filter(f -> {
				System.out.println("filter: " + f);
				return f.startsWith("a");
			})
			.map(m -> {
				System.out.println("map: " + m);
				return m.toUpperCase();
			})
			.forEach(s -> System.out.println("forEach: " + s));
		
	}
}

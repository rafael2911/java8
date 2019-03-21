package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class IterandoEOrdenandoClassesAnonimas {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		strings.add("Iniciando com o java 8!");
		strings.add("Bem vindo...");
		strings.add("Ola");
		strings.add("Seja bem vindo");
		strings.add("UCD");
		strings.add("Unimed");
		
		System.out.println(strings);
		
		strings.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		strings.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
			
		
	}
	
}

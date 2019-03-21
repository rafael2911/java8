package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class IterandoEOrdenandoListas {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		strings.add("Iniciando com o java 8!");
		strings.add("Bem vindo...");
		strings.add("Ola");
		strings.add("Seja bem vindo");
		strings.add("UCD");
		strings.add("Unimed");
		
		System.out.println(strings);
		
		Collections.sort(strings, new ordenacao());
		
		// imprimindo usando metodo default method forEach
		strings.forEach(new imprimindoString());
		
	}
	
}

class ordenacao implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) 
			return -1;
		if(s1.length()>s2.length())
			return 1;
		return 0;
	}
	
}

class imprimindoString implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}



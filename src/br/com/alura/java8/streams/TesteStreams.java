package br.com.alura.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteStreams {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		// Dessa forma você evita fazer o unboxing/autoboxing de Integer para int
		// isso pode gerar um ganho de desepenho significativo para coleções muito grandes
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		// não é possíve usar method reference para esses casos
		// cursos.forEach(c -> System.out.println(c.getNome()));
		
		// então nesses casos seria necessário usar api de streams
		/*
		 * filter: filtrará os cursos que tenham mais de 100 alunos
		 * map: recebendo um curso, retornará um string
		 * forEach: itera a stream, fazendo um println no seu valor (nesse caso, na string mapeada)
		 * 
		 */
		cursos.stream()
		.filter(c -> c.getAlunos() > 100)
		.map(Curso::getNome)
		.forEach(System.out::println);
		
		
		
		System.out.println("");
		System.out.println("Retronando a soma de alunos de todos os cursos");
		
		int soma = cursos.stream()
		.mapToInt(Curso::getAlunos)
		.sum();
		
		System.out.println(soma);
		
		// Conhecendo outros métodos da api de streams
		System.out.println("");
		System.out.println("Outros metodos da api de stream");
		System.out.println(cursos.stream().findFirst().map(Curso::getNome));
		
	}
}

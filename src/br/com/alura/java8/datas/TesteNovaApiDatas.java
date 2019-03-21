package br.com.alura.java8.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TesteNovaApiDatas {
	
	public static void main(String[] args) {
		
		LocalDateTime hj = LocalDateTime.now();
		
		System.out.println(hj.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		
		// data especifica
		LocalDate dataEspecifica = LocalDate.of(2099, Month.JANUARY, 25);
		
		System.out.println(dataEspecifica.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
	}
	
}

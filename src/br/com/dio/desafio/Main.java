package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Curso para estudo de POO");
		curso1.setCargaHoraria(100);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Curso para estudo de JS");
		curso2.setCargaHoraria(100);
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Phillips");
		mentoria1.setDescricao("Como estudar e se aprimorar");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);
	}

}

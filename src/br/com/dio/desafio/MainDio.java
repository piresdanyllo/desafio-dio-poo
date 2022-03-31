package br.com.dio.desafio;

import java.time.LocalDate;

public class MainDio {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Praticando POO");
		curso1.setCargaHoraria(100);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Praticando JS");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Explicando POO");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Web Full Stack ");
		bootcamp.setDescricao("Curso para formação de Desenvolvedor Web Full Stack");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devDanyllo = new Dev();
		devDanyllo.setNome("Danyllo");
		devDanyllo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Danyllo:" + devDanyllo.getConteudosInscritos());
		devDanyllo.progredir();
		devDanyllo.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Danyllo:" + devDanyllo.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Danyllo:" + devDanyllo.getConteudosConcluidos());
		System.out.println("XP:" + devDanyllo.calcularTotalXp());

		System.out.println("-------");

		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

	}

}

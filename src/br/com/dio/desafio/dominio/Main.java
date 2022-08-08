package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo ("curso java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo ("curso js");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo ("mentoria de java");
        mentoria.setDescricao ("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStella = new Dev();
        devStella.setNome("Stella");
        devStella.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devStella.getConteudosInscritos());
        devStella.progredir();
        System.out.println("Conteudos Concluidos" + devStella.getConteudosConcluidos());
        Dev devJoao =  new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();

        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
    }
}

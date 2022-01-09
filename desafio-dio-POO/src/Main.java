import me.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria JAva");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRobert = new Dev();
        devRobert.setNome("Robert");
        devRobert.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Robert:" +devRobert.getConteudosInscritos());

        devRobert.progredir();
        devRobert.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos Robert:" +devRobert.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Robert:" +devRobert.getConteudosConcluidos());
        System.out.println("XP:" + devRobert.calcularTotalXp());

        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila:" +devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos Camila:" +devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" +devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());



    }
}

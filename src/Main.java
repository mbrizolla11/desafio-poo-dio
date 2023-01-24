import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso nivel intermediario");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso nivel iniciante");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Para os participantes do Bootcamp");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp criado pela Dio");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor();
        desenvolvedor1.setNome("Mariane");
        desenvolvedor1.inscreverBootcamp(bootcamp);

        desenvolvedor1.progredir();

        System.out.println("Conteudos inscritos" + desenvolvedor1.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + desenvolvedor1.getConteudosConcluidos());
        System.out.println("XP" + desenvolvedor1.calcularTotalXp());

        System.out.println("**********************");

        Desenvolvedor desenvolvedor2 = new Desenvolvedor();
        desenvolvedor2.setNome("Mariana");
        desenvolvedor2.inscreverBootcamp(bootcamp);

        desenvolvedor2.progredir();

        System.out.println("Conteudos inscritos" + desenvolvedor2.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + desenvolvedor2.getConteudosConcluidos());
        System.out.println("XP" + desenvolvedor2.calcularTotalXp());

    }
}
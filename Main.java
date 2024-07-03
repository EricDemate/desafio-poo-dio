import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
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

        Dev devEric = new Dev();
        devEric.setNome("Eric");
        devEric.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eric: " + devEric.getConteudosInscritos());
        devEric.progredir();
        devEric.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Eric: " + devEric.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eric: " + devEric.getConteudosConcluidos());
        System.out.println("XP: " + devEric.calcularTotalXp());

        System.out.println("-------");

        Dev devPetrus = new Dev();
        devPetrus.setNome("Petrus");
        devPetrus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Petrus: " + devPetrus.getConteudosInscritos());
        devPetrus.progredir();
        devPetrus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Petrus: " + devPetrus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Petrus: " + devPetrus.getConteudosConcluidos());
        System.out.println("XP: " + devPetrus.calcularTotalXp());

        System.out.println("-------");

        Dev devAndrea = new Dev();
        devAndrea.setNome("Andrea");
        devAndrea.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andrea: " + devAndrea.getConteudosInscritos());
        devAndrea.progredir();
        devAndrea.progredir();
        devAndrea.progredir(); // Desempenho maior, progredindo mais
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andrea: " + devAndrea.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andrea: " + devAndrea.getConteudosConcluidos());
        System.out.println("XP: " + devAndrea.calcularTotalXp());
    }
}

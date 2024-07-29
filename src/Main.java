import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Curso Java");
        c1.setDescricao("Descrição curso de java");
        c1.setCargaHoraria(20);

        Mentoria m = new Mentoria();
        m.setTitulo("Mentoria Java");
        m.setDescricao("Descrição mentoria de java");
        m.setData(LocalDate.now());

        // System.out.println(c1);
        // System.out.println(m);
        // System.out.println(c1.calcularXp());
        // System.out.println(m.calcularXp());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desc Bootcamp Java Developoer");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(m);

        Dev dev1 = new Dev();
        dev1.setNome("Henrique");
        dev1.inscreverBootcamp(bootcamp);
        // System.out.println("Conteúdos inscritos " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        dev1.progredir();
        // System.out.println("Conteúdos concluidos " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
        // System.out.println("XP " + dev1.getNome() + " " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Teste");
        dev2.inscreverBootcamp(bootcamp);
        // System.out.println("Conteúdos inscritos " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        // System.out.println("Conteúdos concluidos " + dev2.getNome() + " " + dev2.getConteudosConcluidos());
        // System.out.println("XP " + dev2.getNome() + " " + dev2.calcularTotalXp());

        for (Dev dev : bootcamp.getDevsInscritos()) {
            System.out.println("Conteúdos inscritos " + dev.getNome() + " " + dev.getConteudosInscritos());
            System.out.println("Conteúdos concluidos " + dev.getNome() + " " + dev.getConteudosConcluidos());
            System.out.println("XP " + dev.getNome() + " " + dev.calcularTotalXp());
        }
    }
}

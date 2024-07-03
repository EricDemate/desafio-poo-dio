package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Conjunto de conteúdos inscritos pelo desenvolvedor
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // Conjunto de conteúdos concluídos pelo desenvolvedor

    // Método para inscrever o desenvolvedor em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Adiciona todos os conteúdos do bootcamp aos conteúdos inscritos do desenvolvedor
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // Adiciona o desenvolvedor à lista de inscritos no bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    // Método para progredir no conteúdo inscrito
    public void progredir() {
        // Obtém o primeiro conteúdo inscrito
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            // Move o conteúdo para o conjunto de conteúdos concluídos
            this.conteudosConcluidos.add(conteudo.get());
            // Remove o conteúdo do conjunto de inscritos
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    // Método para calcular o total de XP do desenvolvedor
    public double calcularTotalXp() {
        // Itera pelos conteúdos concluídos e soma o XP
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

        // Alternativamente, poderia usar stream:
        // return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    // Getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Métodos equals e hashCode para garantir a unicidade dos desenvolvedores no conjunto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) &&
               Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
               Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}

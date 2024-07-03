package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now(); // Data inicial do bootcamp
    private final LocalDate dataFinal = dataInicial.plusDays(45); // Data final do bootcamp (45 dias depois da data inicial)
    private Set<Dev> devsInscritos = new HashSet<>(); // Conjunto de desenvolvedores inscritos no bootcamp
    private Set<Conteudo> conteudos = new HashSet<>(); // Conjunto de conteúdos do bootcamp

    // Getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
}

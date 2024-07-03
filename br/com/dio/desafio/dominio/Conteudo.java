package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; // XP padrão para qualquer conteúdo

    private String titulo;
    private String descricao;

    // Método abstrato que deve ser implementado pelas subclasses para calcular o XP específico do conteúdo
    public abstract double calcularXp();

    // Getters e setters para os atributos título e descrição
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

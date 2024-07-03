package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria; // Carga horária do curso

    @Override
    public double calcularXp() {
        // Calcula o XP com base na carga horária do curso
        return XP_PADRAO * cargaHoraria;
    }

    // Getters e setters para a carga horária
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

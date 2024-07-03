<div align="center">
  <img src="logo.png" alt="Logo do Bootcamp Java Developer" width="200"/>
</div>

# 🚀 Bootcamp Java Developer

Primeiramente, gostaria de agradecer à Camila pelo algoritmo original que serviu de base para este projeto. Este é um projeto derivado do [algoritmo da Camila](https://github.com/cami-la/desafio-poo-dio), com algumas alterações e melhorias.

Este projeto simula um bootcamp para desenvolvedores Java, onde eles podem se inscrever em cursos e mentorias, progredir nos conteúdos e calcular seu XP total.

---

## 📚 Classes Principais

### Bootcamp

A classe `Bootcamp` representa o bootcamp em si, contendo uma lista de `Conteudo` (que pode ser tanto `Curso` quanto `Mentoria`) e uma lista de desenvolvedores inscritos (`Dev`).

### Curso

A classe `Curso` é uma subclasse de `Conteudo` que representa um curso dentro do bootcamp. Cada curso possui um título, descrição e carga horária.

### Mentoria

A classe `Mentoria` é outra subclasse de `Conteudo`, representando uma sessão de mentoria no bootcamp. Cada mentoria possui um título, descrição e data.

### Dev

A classe `Dev` representa um desenvolvedor participante do bootcamp. Cada desenvolvedor pode se inscrever em um bootcamp, progredir nos conteúdos inscritos e calcular seu XP total com base nos conteúdos concluídos.

---

## 🖥️ Exemplo de Uso

Aqui está um exemplo básico de como usar essas classes em seu programa:

```java
public class Main {
    public static void main(String[] args) {
        // Criação dos cursos e da mentoria
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda Java do básico ao avançado.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Fundamentos de JavaScript para web.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Arquitetura de Software");
        mentoria.setDescricao("Sessão de mentoria sobre princípios de arquitetura de software.");
        mentoria.setData(LocalDate.now());

        // Criação do bootcamp e adição dos conteúdos
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
  

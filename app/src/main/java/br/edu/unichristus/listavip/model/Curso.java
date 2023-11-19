package br.edu.unichristus.listavip.model;

public class Curso {

    private String curso;

    public Curso(String nomeCurso) {
        this.curso = nomeCurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
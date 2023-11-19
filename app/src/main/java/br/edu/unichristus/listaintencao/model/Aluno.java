package br.edu.unichristus.listaintencao.model;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String telefone;



    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + nome + '\'' +
                ", sobrenome='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
package br.edu.unichristus.listaintencao.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.unichristus.listaintencao.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListCursos(){

        listCursos = new ArrayList<>();

        listCursos.add(new Curso("Aprendizado de Máquina"));
        listCursos.add(new Curso("Ciência de Dados"));
        listCursos.add(new Curso("Testes Automatizados"));
        listCursos.add(new Curso("Matemática para Aprendizado de Máquina"));
        listCursos.add(new Curso("Pesquisa Operacional"));
        listCursos.add(new Curso("Visualização de Dados"));


        return listCursos;
    }

    public ArrayList<String> dadosSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i=0; i < getListCursos().size(); i++){

            Curso objeto = (Curso) getListCursos().get(i);
            dados.add(objeto.getCurso());
        }
        return dados;
    }
}

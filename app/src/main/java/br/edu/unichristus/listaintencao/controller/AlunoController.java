package br.edu.unichristus.listaintencao.controller;

import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import br.edu.unichristus.listaintencao.model.Aluno;
import br.edu.unichristus.listaintencao.view.MainActivity;

public class AlunoController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaIntencao;
    public static final String NOME_PREFERENCES = "preferences";

    public AlunoController(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }

    public void criarSharedPreferences(){


    }

    public void salvar(Aluno aluno) {
        listaIntencao.putString("primeiroNome", aluno.getNome());
        listaIntencao.putString("sobrenome", aluno.getMatricula());
        listaIntencao.putString("curso", aluno.getCurso());
        listaIntencao.putString("telefone", aluno.getTelefone());
        listaIntencao.putString("disciplina").aluno.getDisciplina());
        listaIntencao.apply();

    }



    public Aluno buscar(Aluno aluno){

        aluno.setNome(preferences.getString("primeiroNome", ""));
        aluno.setMatricula(preferences.getString("sobrenome", ""));
        aluno.setCurso(preferences.getString("curso", ""));
        aluno.setTelefone(preferences.getString("telefone", ""));

        return aluno;

    }

    public void limpar(){
        listaVip.clear();
        listaVip.apply();

    }


}
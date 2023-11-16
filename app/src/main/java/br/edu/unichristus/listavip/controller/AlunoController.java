package br.edu.unichristus.listavip.controller;

import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import br.edu.unichristus.listavip.model.Aluno;
import br.edu.unichristus.listavip.view.MainActivity;

public class AlunoController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
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
        listaVip.putString("primeiroNome", aluno.getNome());
        listaVip.putString("sobrenome", aluno.getMatricula());
        listaVip.putString("curso", aluno.getCurso());
        listaVip.putString("telefone", aluno.getTelefone());
        listaVip.apply();

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

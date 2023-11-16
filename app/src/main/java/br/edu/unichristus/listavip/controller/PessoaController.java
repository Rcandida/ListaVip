package br.edu.unichristus.listavip.controller;

import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import br.edu.unichristus.listavip.model.Pessoa;
import br.edu.unichristus.listavip.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "preferences";

    public PessoaController(MainActivity mainActivity) {
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

    public void salvar(Pessoa pessoa) {
        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobrenome", pessoa.getSobrenome());
        listaVip.putString("curso", pessoa.getCurso());
        listaVip.putString("telefone", pessoa.getTelefone());
        listaVip.apply();

    }



    public Pessoa buscar(Pessoa pessoa){

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobrenome(preferences.getString("sobrenome", ""));
        pessoa.setCurso(preferences.getString("curso", ""));
        pessoa.setTelefone(preferences.getString("telefone", ""));

        return pessoa;

    }

    public void limpar(){
        listaVip.clear();
        listaVip.apply();

    }


}

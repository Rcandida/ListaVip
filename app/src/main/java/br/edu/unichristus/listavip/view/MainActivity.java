package br.edu.unichristus.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import br.edu.unichristus.listavip.R;
import br.edu.unichristus.listavip.controller.AlunoController;
import br.edu.unichristus.listavip.model.Curso;
import br.edu.unichristus.listavip.model.Aluno;
import br.edu.unichristus.listavip.controller.CursoController;

public class MainActivity extends AppCompatActivity {

    AlunoController controller;
    CursoController cursoController;

    Aluno aluno;
    List<Curso> listCursos;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editCurso;
    EditText editTelefone;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new AlunoController(MainActivity.this);
        controller.toString();

        cursoController = new CursoController();
        listCursos = cursoController.getListCursos();

        aluno = new Aluno();
        controller.buscar(aluno);
//

        editPrimeiroNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editMatricula);
        editCurso = findViewById(R.id.editCurso);
        editTelefone = findViewById(R.id.editTelefone);
        spinner = findViewById(R.id.spinner);

        editPrimeiroNome.setText(aluno.getNome());
        editSobrenome.setText(aluno.getMatricula());
        editCurso.setText(aluno.getCurso());
        editTelefone.setText(aluno.getTelefone());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cursoController.dadosSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editCurso.setText("");
                editTelefone.setText("");

                controller.limpar();
            }
            
        });
        
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Volte sempre!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aluno.setNome(editPrimeiroNome.getText().toString());
                aluno.setMatricula(editSobrenome.getText().toString());
                aluno.setCurso(editCurso.getText().toString());
                aluno.setTelefone(editTelefone.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo "+ aluno.toString(), Toast.LENGTH_LONG).show();

                controller.salvar(aluno);
            }
        });
    }
}
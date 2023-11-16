package br.edu.unichristus.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.unichristus.listavip.R;
import br.edu.unichristus.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editCurso;
    EditText editTelefone;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();


        pessoa.setPrimeiroNome("Rosa");
        pessoa.setSobrenome("Vasconcelos");
        pessoa.setCurso("Android");
        pessoa.setTelefone("99999999");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCurso = findViewById(R.id.editCurso);
        editTelefone = findViewById(R.id.editTelefone);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobrenome());
        editCurso.setText(pessoa.getCurso());
        editTelefone.setText(pessoa.getTelefone());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editCurso.setText("");
                editTelefone.setText("");
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
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobrenome(editSobrenome.getText().toString());
                pessoa.setCurso(editCurso.getText().toString());
                pessoa.setTelefone(editTelefone.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo "+pessoa.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
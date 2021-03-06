package com.example.agenda.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.agenda.R;
import com.example.agenda.dao.AlunoDAO;
import com.example.agenda.model.Aluno;

import androidx.appcompat.app.AppCompatActivity;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        setTitle("Novo Aluno");

        AlunoDAO dao = new AlunoDAO();


        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);
        final EditText campoData = findViewById(R.id.activity_formulario_aluno_data_aluno);

        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();
                String data = campoData.getText().toString();
                Aluno alunoCriado = new Aluno (nome, telefone, email, data);
                dao.salva(alunoCriado);

                finish();
            }
        });
    }
}
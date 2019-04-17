package br.unicamp.cotuca;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Inclusao extends AppCompatActivity {

    EditText edNome;
    EditText edEmail;
    EditText edTelefone;
    FloatingActionButton fabAgenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inclusao);

        edNome = (EditText)findViewById(R.id.edNome);
        edTelefone = (EditText)findViewById(R.id.edTelefone);
        edEmail = (EditText)findViewById(R.id.edEmail);

        fabAgenda = (FloatingActionButton)findViewById(R.id.fabAgenda);
        fabAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAgenda = new Intent(Inclusao.this, MainActivity.class);
                Bundle params = new Bundle();

                String parNome     =  edNome.getText().toString();
                String parTelefone = edTelefone.getText().toString();
                String parEmail    = edEmail.getText().toString();

                params.putString("nome",parNome);
                params.putString("telefone",parTelefone);
                params.putString("email",parEmail);

                intentAgenda.putExtras(params);
                startActivity(intentAgenda);

            }
        });
    }
}

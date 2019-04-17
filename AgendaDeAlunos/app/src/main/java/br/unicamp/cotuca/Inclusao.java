package br.unicamp.cotuca;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inclusao extends AppCompatActivity {

    EditText edNome;
    EditText edEmail;
    EditText edTelefone;
    FloatingActionButton fabAgenda;
    Button btnSalvar;

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
                finish();
            }
        });

        btnSalvar = (Button)findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();

                String parNome     =  edNome.getText().toString();
                String parTelefone = edTelefone.getText().toString();
                String parEmail    = edEmail.getText().toString();

                resultIntent.putExtra("nome", parNome);
                resultIntent.putExtra("telefone", parTelefone);
                resultIntent.putExtra("email", parEmail);

                setResult(MainActivity.RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}

package br.unicamp.cotuca;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabInclusao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabInclusao = (FloatingActionButton)findViewById(R.id.fabInclusao);
        fabInclusao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent intentInclusao = new Intent(MainActivity.this, Inclusao.class);
            Bundle params = new Bundle();

            startActivity(intentInclusao);

            }
        });
    }
}

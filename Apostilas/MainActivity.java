package br.unicamp.exemplolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvCarro;

    ArrayList<Carro> listaCarro = new ArrayList<Carro>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCarro = (ListView)findViewById(R.id.lvCarro);

        List<Carro> carros = gerarCarros();
        ArrayAdapter<Carro> carrosAdapter = new ArrayAdapter<Carro>(this, android.R.layout.simple_list_item_1, carros);
        lvCarro.setAdapter(carrosAdapter);
    }

    private List<Carro> gerarCarros() {
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(criarCarro("Porshe Carrera"));
        carros.add(criarCarro("Bugatti Veyron"));
        carros.add(criarCarro("Lamborghini Aventador"));
        return carros;
    }

    private Carro criarCarro(String modelo) {
        Carro carro = new Carro(modelo);
        return carro;
    }



}
package br.unicamp.exemplolistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListaCarrosAdapter extends ArrayAdapter<Carro> {

    private Context context;
    private ArrayList<Carro> listaDeCarros = null;

      public ListaCarrosAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Carro> listaDeCarros) {
        super(context, 0, listaDeCarros);
        this.context = context;
        this.listaDeCarros = listaDeCarros;
    }


    public View getView(int position, View view, ViewGroup parent){

          Carro carro = listaDeCarros.get(position);

          if(view == null)
              view = LayoutInflater.from(context).inflate(R.layout.lista_itens,null);

        ImageView imageViewCarro = (ImageView) view.findViewById(R.id.image_view_carro);
        imageViewCarro.setImageResource(carro.getImagem());

        TextView textViewModelo = view.findViewById(R.id.image_view_carro);
        textViewModelo.setText(carro.getModelo());

        return view;

    }

}

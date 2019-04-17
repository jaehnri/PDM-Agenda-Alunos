package br.unicamp.exemplolistview;

public class Carro {

    private String modelo;
    private int imagem;


    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }


    @Override
    public String toString() {
        return modelo; }

}

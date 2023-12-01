package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulos;
    private  int totalReproducoes;
    private  int totalCurtidas;
    private int classificacao;

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public  void  curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }
}

package br.com.etecia.myapplication;

public class Coffee {

    private String titulo;
    private String descricao;
    private String nota;
    private int imagem;

    public Coffee(String titulo, String descricao, String nota, int imagem) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.nota = nota;
        this.imagem = imagem;

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
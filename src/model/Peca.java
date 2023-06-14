package model;

public class Peca {
    private String nome;
    private int codPeca;
    private double peso;
    private double preco;

    public Peca(){
    }

    public Peca(String nome, int codPeca, double peso, double preco) {
        this.nome = nome;
        this.codPeca = codPeca;
        this.peso = peso;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodPeca() {
        return codPeca;
    }

    public void setCodPeca(int codPeca) {
        this.codPeca = codPeca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

package br.com.caelum.livraria.techtalk;

import java.math.BigDecimal;

public class Livro {

    private String nome;
    private BigDecimal preco;

    public Livro(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}

package desafioorientadoaobjetos.invoice;

import java.text.DecimalFormat;

public class Invoice {

    private int numeroFatura;
    private String descricao;
    private int qtdComprada;
    private double precoUnitario;

    public Invoice(int numeroFatura, String descricao, int qtdComprada, double precoUnitario) {

        if (qtdComprada < 0){
            qtdComprada = 0;
        }
        if (precoUnitario < 0){
            precoUnitario = 0;
        }
        this.numeroFatura = numeroFatura;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.precoUnitario = formatacao(precoUnitario);
}

    public int getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(int numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getInviniceAmount(){
        return formatacao(precoUnitario*qtdComprada);
    }

    private double formatacao(double valor){
        DecimalFormat df = new DecimalFormat("##.##");
        double novoValor = Double.valueOf(df.format(valor).replace(",", "."));
        return novoValor;
    }

    @Override
    public String toString() {
        return "\n----------------------------\n" +
                "Numero da Fatura= " + numeroFatura +
                "\nDescricao= " + descricao +
                "\nQuantidade Comprada= " + qtdComprada +
                "\nPreço Unitario= " + precoUnitario +
                "\nValor a Pagar= "+ getInviniceAmount();
    }
}

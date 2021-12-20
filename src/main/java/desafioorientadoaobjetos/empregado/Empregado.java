package desafioorientadoaobjetos.empregado;

import java.text.DecimalFormat;

public class Empregado {

    private String nome;
    private String sobreNome;
    private double salario;

    public Empregado(String nome, String sobreNome, double salario) {
       if (salario < 0){
           salario = 0.0;
       }
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioAnual(){
        return formatacao(this.salario*12);
    }

    public void aumentoSalarial(double aumento){
        double novoSalario = salario + salario*aumento/100;
        salario = formatacao(novoSalario);
       }

    private double formatacao(double valor){
        DecimalFormat df = new DecimalFormat("##.##");
        double novoValor = Double.valueOf(df.format(valor).replace(",", "."));
        return novoValor;
    }

    @Override
    public String toString() {
        return "\n*** Dados do Empregado ***" +
                "\nNome= " + nome + " " + sobreNome +
                "\nSalario= R$" + salario +
                "\nsalario Anual= R$" + getSalarioAnual();
    }
}

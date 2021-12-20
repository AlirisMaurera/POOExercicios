package desafioorientadoaobjetos.complex;

import java.text.DecimalFormat;

public class Complex {

    private double real;
    private double imaginario;

    public Complex() {
        this.real = 0;
        this.imaginario = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginario = 0;
    }

    public Complex(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }

    public double getValorAbsoluto(){
        double valorAbs = Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginario,2));
        return formatacao(valorAbs);
    }

    public double getAngulo(){
        double angulo = Math.atan(this.imaginario/this.real);
        angulo = Math.round(Math.toDegrees(angulo));
        if(this.real < 0 && this.imaginario > 0){
            return (angulo +180);
        } else if(this.real < 0 && this.imaginario < 0) {
            return (angulo + 180) ;
        }else if(this.real > 0 && this.imaginario < 0) {
            return (angulo + 360) ;
        }
        return angulo;
    }

    public Complex getInversoAditivo(){
        if(this.real != 0 && this.imaginario != 0){
           double a = this.real*(-1);
           double b = this.imaginario*(-1);
            return new Complex(a,b);
        }
        return new Complex(0,0);
    }

    public boolean iguais(Complex complex1){
        if (this.real == complex1.getReal() && this.imaginario == complex1.getImaginario()){
            return true;
        }
        return false;
    }

    public Complex adicao(Complex complex1){
        double a, b;
        a = this.real + complex1.getReal();
        b = this.imaginario + complex1.getImaginario();
        return new Complex(a,b);
    }

    public Complex substraer(Complex complex1){
        double a, b;
        a = this.real - complex1.getReal();
        b = this.imaginario - complex1.getImaginario();
        return new Complex(a,b);

    }

    public Complex multiplica(Complex complex1){
        double a, b;
        a = this.real*complex1.getReal() - this.imaginario*complex1.getImaginario();
        b = this.real*complex1.getImaginario() + this.imaginario*complex1.getReal();
        return new Complex(a,b);

    }

    public Complex divide(Complex complex1){
        double a, b, c;
        c = (Math.pow(complex1.getReal(),2)+Math.pow(complex1.getImaginario(),2));
        a = formatacao((this.real*complex1.getReal() + this.imaginario*complex1.getImaginario())/c);
        b = formatacao((this.imaginario*complex1.getReal() - this.real*complex1.getImaginario())/c);

        return new Complex(a,b);
    }

    private double formatacao(double valor){
        DecimalFormat df = new DecimalFormat("##.##");
        double novoValor = Double.valueOf(df.format(valor).replace(",", "."));
        return novoValor;
    }

    @Override
    public String toString() {
        return "Z = ("+ real +" "+ imaginario +"i)";
    }

}

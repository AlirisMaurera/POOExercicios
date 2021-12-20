package desafioorientadoaobjetos.datas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datas {

    private int dia;
    private int mes;
    private int ano;
    LocalDate date = null;

    public Datas(int dia, int mes, int ano) {

        try {
            date= LocalDate.of(ano,mes, dia);
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public Datas() {
        date = LocalDate.now();
        this.dia = date.getDayOfMonth();
        this.mes = date.getMonthValue();
        this.ano = date.getYear();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String avancarUmDia() {
        if (date !=null){
             date = iniciaData();
             LocalDate date2 = date.plusDays(1);
            return formatar(date2);
        }
        return "A data é invalida";
    }

    private LocalDate iniciaData(){
        return LocalDate.of(this.ano,this.mes, this.dia);
    }

    public String formatar(LocalDate data) {
        DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(fr);
    }

    @Override
    public String toString() {
        if (date != null){
            date = iniciaData();
            return formatar(date);
        }
        return "Data inválida";
    }
}

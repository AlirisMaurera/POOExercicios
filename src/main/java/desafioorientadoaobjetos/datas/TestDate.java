package desafioorientadoaobjetos.datas;

public class TestDate {

    public static void main(String[] args) {


        Datas date = new Datas();
        System.out.println("Dia= "+date);
        System.out.println("Dia seguinte= "+date.avancarUmDia());

        Datas date1 = new Datas(31,12,2024);
        System.out.println("Dia= "+date1);
        System.out.println("Dia seguinte= "+date1.avancarUmDia());

    }
}

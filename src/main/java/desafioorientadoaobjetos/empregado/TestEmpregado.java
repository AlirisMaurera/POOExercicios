package desafioorientadoaobjetos.empregado;

public class TestEmpregado {

    public static void main(String[] args) {
        //Instanciando dois empregados
        Empregado empregado1 = new Empregado("Aliris", "Maurera", 1500.31);
        Empregado empregado2 = new Empregado("Sebastian", "Rivero", 2700.25);

        System.out.println(empregado1);
        System.out.println(empregado2);

        //Dando um ajuste salarial
        empregado1.aumentoSalarial(10);
        empregado2.aumentoSalarial(10);
        System.out.println("\n*** Empregados com aumento salarial de 10% ***");
        System.out.println(empregado1);
        System.out.println(empregado2);
    }
}


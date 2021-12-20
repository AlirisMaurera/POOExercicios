package desafioorientadoaobjetos.invoice;

public class TestInvoice {

    public static void main(String[] args) {
        //Testando to string
        //Fatura com quantidade comprada e preço unitario negativo
        Invoice invoice = new Invoice(1235, "Computador de mesa", -5, -2.3);
        System.out.println(invoice);

        //Fatura com valores positivos
        Invoice invoice1 = new Invoice(2563, "Monitor de computador", 5, 99.26);
        System.out.println(invoice1);

        //Fatura com quantidade Comprada zero
        Invoice invoice2 = new Invoice(3693, "Mouse", 0, 40);
        System.out.println(invoice2);
    }
}

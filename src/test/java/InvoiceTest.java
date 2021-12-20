import desafioorientadoaobjetos.invoice.Invoice;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InvoiceTest {

    Invoice invoice;

    @Test
    public void quandoInstanciarComNumeroNegativosQuantidadeEPrecoDeveColocarZero(){
        invoice = new Invoice(1235, "Computador de mesa", -5, -2.3);

        assertEquals(0, invoice.getQtdComprada());
        assertEquals(0.0, invoice.getPrecoUnitario());

    }

    @Test
    public void quandoSolicitarOValorAPagarDaFaturaDeveDevolverQuantidadeMultiplicadaPorPreco(){
        invoice = new Invoice(1235, "Computador de mesa", 7, 6.52);

        assertEquals(45.64, invoice.getInviniceAmount());

    }
}

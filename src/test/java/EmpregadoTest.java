import desafioorientadoaobjetos.empregado.Empregado;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpregadoTest {

    private Empregado empregado;

    @Test
    public void QuandoSalarioENegativoDeveColocarSalariozero(){
        empregado = new Empregado("Aliris", "Maurera", -1650.22);

        assertEquals(0, empregado.getSalario());
    }

    @Test
    public void QuandoPedirSalarioAnualDeveDevolverSalarioMultiplicadoPorDoze(){
        empregado = new Empregado("Aliris", "Maurera", 1650.22);

        assertEquals(19802.64, empregado.getSalarioAnual());
    }

    @Test
    public void QuandoDarAjusteSalarialDevolveSalarioMaisAjuste(){
        empregado = new Empregado("Aliris", "Maurera", 1650.22);
        empregado.aumentoSalarial(10);

        assertEquals(1815.24, empregado.getSalario());
    }
}

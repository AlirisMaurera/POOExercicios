import desafioorientadoaobjetos.datas.Datas;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import java.time.DateTimeException;
import java.time.LocalDate;

public class DatasTest {

    private Datas data;

    //Validando inicialização vazia
    @Test
    public void quandoInicializarSemDataElaInicializaComADataDeHoje() {
        LocalDate teste = LocalDate.now();
        data = new Datas();

        assertEquals(teste.getDayOfMonth(), data.getDia());
        assertEquals(teste.getMonthValue(), data.getMes());
        assertEquals(teste.getYear(), data.getAno());
    }

    //Validando datas erradas
    @Test
    public void quandoInicializarComDiaInvalidaDaUmaExcepcao() {
        try {
            data = new Datas(40, 12, 2021);
        } catch (DateTimeException e) {
            assertThat(e.getMessage(), startsWith("Invalid value for DayOfMonth (valid values 1 - 28/31)"));
        }
    }

    @Test
    public void quandoInicializarComMesInvalidaDaUmaExcepcao() {
        try {
            data = new Datas(30, 13, 2021);
        } catch (DateTimeException e) {
            assertThat(e.getMessage(), startsWith("Invalid value for MonthOfYear (valid values 1 - 12)"));
        }
    }

    //Teste avançar um dia
    @Test
    public void quandoAvancarUmDiaEleDevolverADataDoDiaSeguinte() {
        data = new Datas(31, 12, 2021);

        assertEquals("01/01/2022",data.avancarUmDia());
    }
}

import desafioorientadoaobjetos.complex.Complex;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComplexTest {

    private Complex complex;
    private Complex complex2;

    //Testando Angulo em diferentes quadrantes
    @Test
    public void quandoEnviarUmNumeroComplexoPrimeiroQuadranteDevolveUmAnguloEntre0e90(){
        complex = new Complex(1,1);

        assertEquals(45.0,complex.getAngulo());
    }
    @Test
    public void quandoEnviarUmNumeroComplexoSegundoQuadranteDevolveUmAnguloEntre90e180(){
        complex = new Complex(-1,1);

        assertEquals(135.0,complex.getAngulo());
    }

    @Test
    public void quandoEnviarUmNumeroComplexoTerceiroQuadranteDevolveUmAnguloEntre180e270(){
        complex = new Complex(-1,-1);

        assertEquals(225.0,complex.getAngulo());
    }

    @Test
    public void quandoEnviarUmNumeroComplexoQuartoQuadranteDevolveUmAnguloEntre270e360(){
        complex = new Complex(1,-1);

        assertEquals(315.0,complex.getAngulo());
    }

    //Testando Operações
    @Test
    public void quandoEnviarDoisNumeroComplexoEleDevolveASomaDosDois(){
        complex = new Complex(1,-1);
        complex2 = new Complex(1,-1);
        Complex somaDosNumeros = complex.adicao(complex2);

        assertEquals(2,somaDosNumeros.getReal());
        assertEquals(-2,somaDosNumeros.getImaginario());
    }

    @Test
    public void quandoEnviarDoisNumeroComplexoEleDevolveASubstracaoDosDois(){
        complex = new Complex(1,-1);
        complex2 = new Complex(1,-1);
        Complex somaDosNumeros = complex.substraer(complex2);

        assertEquals(0,somaDosNumeros.getReal());
        assertEquals(0,somaDosNumeros.getImaginario());
    }

    @Test
    public void quandoEnviarDoisNumeroComplexoEleDevolveAMultiplicacaoDosDois(){
        complex = new Complex(1,-1);
        complex2 = new Complex(2,-2);
        Complex somaDosNumeros = complex.multiplica(complex2);

        assertEquals(0,somaDosNumeros.getReal());
        assertEquals(-4,somaDosNumeros.getImaginario());
    }

    @Test
    public void quandoEnviarDoisNumeroComplexoEleDevolveADivicaoDosDois(){
        complex = new Complex(1,-1);
        complex2 = new Complex(2,-2);
        Complex somaDosNumeros = complex.divide(complex2);

        assertEquals(0.5,somaDosNumeros.getReal());
        assertEquals(0,somaDosNumeros.getImaginario());
    }

    //Teste de comparação de dois números complexos
    @Test
    public void quandoEnviarDoisNumerosComplexosComparaEDevolveTrueOuFalseSeSaoIguais(){
        complex = new Complex(1,-1);
        complex2 = new Complex(2,-2);

        assertEquals(false, complex.iguais(complex2));
    }

    //Teste valor absoluto de um número complexo
    @Test
    public void quandoenviarUmNumeroComplexoDevolveOvalorAbsoluto(){
        complex = new Complex(1,-1);

        assertEquals(1.41, complex.getValorAbsoluto());
    }

    //Teste Inverso Aditivo
    @Test
    public void quandoEnviarUmNumeroComplexoDevolveSeuInversoAditivo(){
        complex = new Complex(1,-1);
        Complex novoNumero = complex.getInversoAditivo();

        assertEquals(-1, novoNumero.getReal());
        assertEquals(1, novoNumero.getImaginario());
    }
}

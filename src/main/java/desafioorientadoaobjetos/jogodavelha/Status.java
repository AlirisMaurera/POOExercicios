package desafioorientadoaobjetos.jogodavelha;

public enum Status {

    VAZIO(" "),
    JOGADOR_1("x"),
    JOGADOR_2("o");

    private final String valor;

    Status(String opcao) {
        valor = opcao;
    }

    public  String getValor(){
        return valor;
    }
}

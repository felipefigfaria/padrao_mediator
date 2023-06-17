package org.example;

public class Hospital implements Setor {

    private static Hospital instancia = new Hospital();

    private Hospital() {}

    public static Hospital getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Hospital vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Hospital agradece o feedback: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Hospital vai analisar a sua sugestão: " + mensagem;
    }
}
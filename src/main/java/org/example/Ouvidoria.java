package org.example;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioHospital(String mensagem) {
        return "A Ouvidoria agradece o contato.\n"+
                "O Hospital respondeu o feedback conforme mensagem a seguir.\n" +
                ">>" + Hospital.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoHospital(String mensagem) {
        return "A Ouvidoria agradece o contato.\n"+
                "O Hospital respondeu o feedback conforme mensagem a seguir.\n" +
                ">>" + Hospital.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoHospital(String mensagem) {
        return "A Ouvidoria agradece o contato.\n"+
                "O Hospital respondeu o feedback conforme mensagem a seguir.\n" +
                ">>" + Hospital.getInstancia().receberSugestao(mensagem);
    }
}
package org.example;

public class Pessoa {

    public String elogiarHospital(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioHospital(mensagem);
    }

    public String reclamarHospital(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoHospital(mensagem);
    }

    public String sugerirHospital(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoHospital(mensagem);
    }
}
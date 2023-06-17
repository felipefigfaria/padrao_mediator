package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveElogiarHospital() {
        Paciente paciente = new Paciente();
        assertEquals("A Ouvidoria agradece o contato.\nO Hospital respondeu o feedback conforme mensagem a seguir.\n" +
                        ">>O Hospital agradece o feedback: Equipe atenciosa com os pacientes.",
                paciente.elogiarHospital("Equipe atenciosa com os pacientes."));
    }

    @Test
    void deveReclamarHospital() {
        Paciente paciente = new Paciente();
        assertEquals("A Ouvidoria agradece o contato.\nO Hospital respondeu o feedback conforme mensagem a seguir.\n" +
                        ">>O Hospital vai procurar melhorar o serviço da reclamação: Demora para ser atendido.",
                paciente.reclamarHospital("Demora para ser atendido."));
    }

    @Test
    void deveSugerirHospital() {
        Paciente paciente = new Paciente();
        assertEquals("A Ouvidoria agradece o contato.\nO Hospital respondeu o feedback conforme mensagem a seguir.\n" +
                        ">>O Hospital vai analisar a sua sugestão: Aumentar leitos do Hospital.",
                paciente.sugerirHospital("Aumentar leitos do Hospital."));
    }
}
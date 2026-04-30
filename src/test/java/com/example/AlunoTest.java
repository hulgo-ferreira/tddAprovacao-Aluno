package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void deveReprovarPorFrequencia() {
        Aluno aluno = new Aluno();
        assertEquals("Reprovado", aluno.determinarAprovacao(74, 70, 50));
        assertEquals("Aprovado", aluno.determinarAprovacao(76, 70, 60));
    }

    @Test
    public void deveAprovarPorNotaFinal() {
        Aluno aluno = new Aluno();
        assertEquals("Reprovado", aluno.determinarAprovacao(76, 59, 20));
        assertEquals("Aprovado", aluno.determinarAprovacao(80, 60, 50));
    }

    @Test
    public void deveAprovarPorNotaFinalEspecial() {
        Aluno aluno = new Aluno();
        assertEquals("Reprovado", aluno.determinarAprovacao(80, 59, 40));
        assertEquals("Aprovado", aluno.determinarAprovacao(80, 40, 90));
    }

    @Test
    public void deveReprovarParametroNegativo() {
        Aluno aluno = new Aluno();
        assertEquals("Reprovado", aluno.determinarAprovacao(-1, 70, 50));
        assertEquals("Reprovado", aluno.determinarAprovacao(80, -1, 50));
        assertEquals("Reprovado", aluno.determinarAprovacao(80, 70, -1));
        assertEquals("Reprovado", aluno.determinarAprovacao(80, -10, 130));
    }
}

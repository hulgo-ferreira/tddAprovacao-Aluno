package com.example;
 
public class Aluno {
 
    public String determinarAprovacao(int frequencia, int notaFinal, int notaEspecial) {
        if (frequencia < 75 || notaFinal < 0 || notaEspecial < 0) {
            return "Reprovado";
        }
 
        boolean aprovadoDireto = notaFinal >= 60;
        boolean aprovadoNaEspecial = ((notaFinal + notaEspecial) / 2.0) >= 60;
 
        if (aprovadoDireto || aprovadoNaEspecial) {
            return "Aprovado";
        }
 
        return "Reprovado";
    }
}
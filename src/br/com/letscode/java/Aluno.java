package br.com.letscode.java;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    public static final int QTD_LIVROS = 3;
    private static final int PRAZO_DEVOLUCAO_DIAS = 10;

    private LocalDate suspensoAte;

    public Aluno() {
        //padrão
    }

    public Aluno(String nome, String matricula, String email) {
        super(nome, matricula, email);
    }

    @Override
    public int getPrazoDevolucaoDias() {
        return PRAZO_DEVOLUCAO_DIAS;
    }

    public LocalDate getSuspensoAte() {
        return suspensoAte;
    }

    public void setSuspensoAte(LocalDate suspensoAte) {
        this.suspensoAte = suspensoAte;
    }
}

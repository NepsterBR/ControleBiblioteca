package br.com.letscode.java;

public class Professor extends Pessoa {

    public static final int QTD_LIVROS = 5;
    private static final int PRAZO_DEVOLUCAO_DIAS = 20;

    public Professor() {
        //padrão
    }

    public Professor(String nome, String matricula, String email) {
        super(nome, matricula, email);
    }

    @Override
    public int getPrazoDevolucaoDias() {
        return PRAZO_DEVOLUCAO_DIAS;
    }

    public void darAula() {
        System.out.println("O professor está dando aula.");
    }

}

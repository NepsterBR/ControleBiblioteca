package br.com.letscode.java;

public class EmprestimoNaoEncontradoException extends RuntimeException {

    public EmprestimoNaoEncontradoException() {
        super("Empréstimo não encontrado!");
    }
}

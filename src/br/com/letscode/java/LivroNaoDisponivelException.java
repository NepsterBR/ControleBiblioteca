package br.com.letscode.java;

public class LivroNaoDisponivelException extends RuntimeException {

    public LivroNaoDisponivelException(Livro livro) {
        super("O livro " + livro.getTitulo() + " não está disponível.");
    }
}

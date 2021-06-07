package br.com.letscode.java;

//POJO
public class Livro {

    private Long isbn;
    private String titulo;
    private String autor;
    private String editora;
    private boolean disponivel = true;

    public Livro() {
        //padrão
    }

    public Livro(Long isbn, String titulo, String autor, String editora, boolean disponivel) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.disponivel = disponivel;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
            "isbn=" + isbn +
            ", titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", editora='" + editora + '\'' +
            ", disponível=" + disponivel +
            '}';
    }
}

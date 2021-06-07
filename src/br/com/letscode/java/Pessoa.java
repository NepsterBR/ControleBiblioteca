package br.com.letscode.java;

//POJO - Plain-Old-Java-Object
public abstract class Pessoa {

    protected String nome;
    protected String matricula;
    protected String email;

    public Pessoa() {
        //padrão
    }

    public Pessoa(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public abstract int getPrazoDevolucaoDias();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
            "nome='" + nome + '\'' +
            ", matricula='" + matricula + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}

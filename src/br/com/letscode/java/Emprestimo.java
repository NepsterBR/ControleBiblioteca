package br.com.letscode.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emprestimo {

    private static final int QTD_MAXIMA_LIVROS = 3;
    private static final List<LocalDate> feriados = getListFeriados();

    private Pessoa pessoa;
    private Livro[] livros;
    private final LocalDate dataInicio;
    private LocalDate dataDevolucao;//data efetiva de devolução

    private static List<LocalDate> getListFeriados() {
        List<LocalDate> datas = new ArrayList<>();
        datas.add(LocalDate.of(2021, 1, 1));
        datas.add(LocalDate.of(2021, 5, 1));
        datas.add(LocalDate.of(2021, 4, 21));
        datas.add(LocalDate.of(2021, 10, 12));
        datas.add(LocalDate.of(2021, 11, 15));
        datas.add(LocalDate.of(2021, 11, 2));
        datas.add(LocalDate.of(2021, 12, 25));
        datas.add(LocalDate.of(2021, 9, 7));
        datas.add(LocalDate.of(2021, 6, 3));
        return datas;
    }

    public Emprestimo() {
        this.dataInicio = LocalDate.now();
    }

    public Emprestimo(Pessoa pessoa, Livro[] livros) throws ExcedeuQuantidadeMaximaLivrosException {
        this.pessoa = pessoa;
        this.livros = livros;
        this.dataInicio = LocalDate.now();

        //checar o tamanho do array Livro[] para não ultrapassar o tamanho máximo
        if (livros.length > QTD_MAXIMA_LIVROS) {
           throw new ExcedeuQuantidadeMaximaLivrosException(livros.length, QTD_MAXIMA_LIVROS);
        }
    }

    /**
     * Regra "dataInicio + prazo (Aluno/Professor)"
     * @return a data estimada para devolução
     */
    public LocalDate calcularDataPrevistaDevolucao() {
        var date = this.dataInicio;
        var prazoEmDias = this.pessoa.getPrazoDevolucaoDias();
        int contDiasUteis = 0;

        while (contDiasUteis < prazoEmDias) {
            boolean fimDeSemana = date.getDayOfWeek().equals(DayOfWeek.SATURDAY)
                || date.getDayOfWeek().equals(DayOfWeek.SUNDAY);

            if (!fimDeSemana && !feriados.contains(date)) {
                contDiasUteis++;//dia útil
            }
            date = date.plusDays(1);
        }
        return date;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
            "pessoa=" + pessoa +
            ", livros=" + Arrays.toString(livros) +
            ", dataInicio=" + dataInicio +
            ", dataDevolucao=" + dataDevolucao +
            '}';
    }
}

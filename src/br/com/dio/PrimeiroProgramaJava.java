package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        String nome = null;
        Integer numPaginas = null;

        Livro livro1 = new Livro("O problebma dos 3 corpos");
        System.out.println(livro1);
        //    int a = 5;
        //    int b = 3;
        //    System.out.println("Hello World!" + "\n" + (a + b));
    }
}
class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public Livro(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

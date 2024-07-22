package aulas.aula7.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        this.acervo = new ArrayList<Livro>();
    }

    Livro buscaLivro(String isbn) {
        for (Livro livro: acervo) {
            if (isbn.equals(livro.isbn)) {
                return livro;
            }
        }

        return null;
    }
    
    boolean adicionarLivro(Livro livro) {
        Livro livroRegistrado = buscaLivro(livro.isbn);
        if (livroRegistrado == null) {
            acervo.add(livro);
            return true;
        } 

        return false;
    }

    boolean removerLivro(String isbn) {
        Livro livro = buscaLivro(isbn);
        if (livro == null) {
            return false;
        } 

        acervo.remove(livro);
        return true;
    }

    ArrayList<Livro> listoTodos() {
       return acervo;
    }

    ArrayList<Livro> listaEmprestados() {
        var emprestados = new ArrayList<Livro>();

        for (Livro livro: acervo) {
            if (livro.estaEmprestado()) {
                emprestados.add(livro);
            }
        }

        return emprestados;
    } 


    ArrayList<Livro> listaDisponiveis() {
        var disponiveis = new ArrayList<Livro>();

        for (Livro livro: acervo) {
            if (livro.estaEmprestado()) {
                disponiveis.add(livro);
            }
        }

        return disponiveis;
    } 
}
  
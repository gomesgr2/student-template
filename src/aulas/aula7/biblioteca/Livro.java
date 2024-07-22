package aulas.aula7.biblioteca;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    // TODO : validar ISBN
    String isbn;
    boolean emprestado;

    Livro(String titulo, String autor, String isbn, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        emprestado = false;
    }

    String converteParaString() {
        return this.autor + ". " + this.titulo + ", " + this.anoPublicacao + " " + this.isbn;
    }

    boolean estaEmprestado() {
        return emprestado;
    }

    void emprestar() {
        if (estaEmprestado()) {
            throw new IllegalStateException( String.format("O livro %s esta emprestado", titulo));
        }
        emprestado =  true;

    }

    void devolver() {
        if (!estaEmprestado()) {
            throw new IllegalStateException( String.format("O livro %s nao esta emprestado", titulo));
        }
        emprestado = false;
    }

    
}
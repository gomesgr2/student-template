package aulas.aula7.biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro(
            "O senhor dos anéis",
            "Bla1",
            "123",
            2023
        );

        Livro livro2 = new Livro(
            "O hobbit",
            "Bla1",
            "123-0",
            2023
        );

        Livro livro3 = new Livro(
            "Dom quixote",
            "Bla2",
            "133",
            2024
        );

        Livro livro4 = new Livro(
            "TI",
            "Bla1",
            "123-10",
            1990
        );

        Livro livro5 = new Livro(
            "TI é legal",
            "Bla3",
            "123-10",
            1998
        );

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        
        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        livro4.emprestar();

        System.out.println("Livros emprestado:");
        for (Livro livro: biblioteca.listaEmprestados()) {
            System.out.println(livro.converteParaString());
        }
    }
}

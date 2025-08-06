package Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 120.00);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 50.00);
        Livro livro3 = new Livro("Clean Code", "Robert C. Martin", 2008, 150.00);

        // Adicionando à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listando disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Emprestando um livro
        livro1.emprestar();

        // Tentando emprestar novamente
        livro1.emprestar();

        // Devolvendo o livro
        livro1.devolver();

        // Aplicando desconto
        livro3.aplicarDesconto(10);

        // Mostrando valor total
        System.out.println("\nValor total dos livros: R$ " + biblioteca.calcularValorTotal());

        // Buscando por título
        Livro buscado = biblioteca.buscarLivroPorTitulo("Dom Casmurro");
        if (buscado != null) {
            System.out.println("\nLivro encontrado: " + buscado.getTitulo() +
                               " - Autor: " + buscado.getAutor());
        } else {
            System.out.println("\nLivro não encontrado!");
        }

        // Idade de um livro
        System.out.println("\nIdade do livro 'Dom Casmurro': " +
                           livro2.obterIdade(2025) + " anos");
    }
}

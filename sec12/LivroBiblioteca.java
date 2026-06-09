package sec12;

public class LivroBiblioteca {
    
    private String titulo;
    private String autor;
    boolean disponivel;

    public LivroBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public LivroBiblioteca(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void exibirInfo() {
        System.out.println("\nTítulo: " + titulo + "\nAutor: " + autor + "\nDisponível: " + (disponivel ? "Sim" : "Não"));
    }

    public void pegarEmprestado() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Você pegou emprestado o livro " + titulo);
        } else {
            System.out.println("O livro " + titulo + " não está disponível");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro " + titulo + " devolvido!");
        } else {
            System.out.println("O  livro " + titulo + " não estava emprestado");
        }
    }
    
}

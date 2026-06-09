package sec12;

public class Aluno {
    
    private String nome;
    private String matricula;
    private int notaFinal;

    public Aluno(String nome, String matricula, int notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty() && nome != null) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void setMatricula(String matricula) {
        if (!matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            System.out.println("A matrícula não pode ser vazia");
        }
    }

    public void setNotaFinal(int notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("A nota deve estar entre 0 e 100");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public int getNotaFinal() {
        return this.notaFinal;
    }
}

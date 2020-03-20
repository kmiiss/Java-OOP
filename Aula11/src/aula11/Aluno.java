package aula11;
public class Aluno extends Pessoa {
    private int Matr;
    private String Curso;
    
    public void PagarMensalidade() {
        System.out.println("Pagando a mensalidade do(a) Aluno(a): "+ this.Nome);
    }
    public int getMatr() {
        return this.Matr;
    }
    public void setMatr(int Matr) {
        this.Matr = Matr;
    }
    public String getCurso() {
        return this.Curso;
    }
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
}

package colegio;
public class Aluno extends Pessoa {
    //Atributos
    private int Matr;
    private String Curso;
    
    //Método
    public void cancelarMatr() {
        System.out.println("Sua matrícula será cancelada!");
    }

    //Métodos getters/setters
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

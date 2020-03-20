package colegio;
public class Professor extends Pessoa{
    //Atributos
    private String Especialidade;
    private float Salario;
    
    //Métodos
    public void receberAum(float aum) {
        this.Salario += aum;
    }
    
    //Métodos getters/setters
    public String getEspecialidade() {
        return this.Especialidade;
    }
    
    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }
    
    public float getSalario() {
        return this.Salario;
    }
    
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
}

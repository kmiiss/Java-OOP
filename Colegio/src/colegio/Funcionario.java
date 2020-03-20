package colegio;
public class Funcionario extends Pessoa {
    //Atributos
    private String Setor;
    private boolean Trabalhando;
    
    //Métodos
    public void mudarTrabalho() {
        this.Trabalhando = ! this.Trabalhando;
    }
    
    //Métodos getters/setters
    public String getSetor() {
        return this.Setor;
    }
    
    public void setSetor(String Setor) {
        this.Setor = Setor;
    }
    
    public boolean isTrabalhando() {
        return this.Trabalhando;
    }
    
    public void setTrabalhando(boolean Trabalhando) {
        this.Trabalhando = Trabalhando;
    }
    
}

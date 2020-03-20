package projetolivro;
public class Pessoa {
    //Atributos
    private String Nome;
    private int Idade;
    private String Sexo;

public void fazerAniver() {
    this.Idade++;
    }

public Pessoa(String Nome, int Idade, String Sexo) {
    this.Nome = Nome;
    this.Idade = Idade;
    this.Sexo = Sexo;
    }

    public String getNome() {
        return this.Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public int getIdade() {
        return this.Idade;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    public String getSexo() {
        return this.Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
} 
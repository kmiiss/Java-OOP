package aula11;
public abstract class Pessoa {
    protected String Nome;
    protected int Idade;
    protected String Sexo;
    
public void fazerAniversario() {
     this.Idade++;
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

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + Nome + ", Idade=" + Idade + ", Sexo=" + Sexo + '}';
    }

}

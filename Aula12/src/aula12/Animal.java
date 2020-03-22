package aula12;
public abstract class Animal {
protected float Peso;
protected int Idade;
protected int Membros;

public abstract void locomover();
public abstract void alimentar();
public abstract void emitirSom();

public float getPeso() {
    return this.Peso;
}
public void setPeso(float Peso) {
    this.Peso = Peso;
}
public int getIdade() {
    return this.Idade;
}
public void setIdade(int Idade) {
    this.Idade = Idade;
}
public int getMembros() {
    return this.Membros;
}
public void setMembros(int Membros) {
    this.Membros = Membros;
}
}

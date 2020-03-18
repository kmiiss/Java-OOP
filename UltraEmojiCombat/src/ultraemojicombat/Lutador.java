package ultraemojicombat;
public final class Lutador {
    //Atributos
    private String Nome;
    private String Nacionalidade;
    private int Idade;
    private float Altura;
    private float Peso;
    private String Categoria;
    private int Vitorias;
    private int Derrotas;
    private int Empates;

//Métodos publicos
public void apresentar() {
    System.out.println("CHEGOU A HORA! Com vocês o lutador: "+ this.getNome());
    System.out.println("Vindo de: " + this.getNacionalidade());
    System.out.println(this.getIdade() + "anos");
    System.out.println(this.getAltura() + "m de altura");
    System.out.println("Pesando: " + this.getPeso() + "Kg");
    System.out.println("Ganhou: " + this.getVitorias());
    System.out.println("Perdeu: " + this.getDerrotas());
    System.out.println("Empatou: " + this.getEmpates());
}
public void status() {
    System.out.println(this.getNome() + " É um peso " + this.getCategoria());
    System.out.println("Com " + this.getVitorias() + " vitórias.");
    System.out.println(this.getDerrotas() + " derrotas.");
    System.out.println(this.getEmpates() + " empate(s).");
}
public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
}
public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
}
public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
}
//Constructor
public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
    this.Nome = nome;
    this.Nacionalidade = nacionalidade;
    this.Idade = idade;
    this.Altura = altura;
    this.setPeso(peso);
    this.Vitorias = vitorias;
    this.Derrotas = derrotas;
    this.Empates = empates;
}
//Métodos getters/setters
public String getNome() {
    return Nome;
}
public void setNome(String nome) {
    this.Nome = nome;
}
public String getNacionalidade() {
    return Nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
    this.Nacionalidade = nacionalidade;
}
public int getIdade() {
    return Idade;
}
public void setIdade(int idade) {
    this.Idade = idade;
}
public float getAltura() {
    return Altura;
}
public void setAltura(float altura) {
    this.Altura = altura;
}
public float getPeso() {
    return Peso;
}
public void setPeso(float peso) {
    this.Peso = peso;
    this.setCategoria();
}
public String getCategoria() {
    return Categoria;
} 
private void setCategoria() {  
    if (this.Peso < 52.2) {
        this.Categoria = "Inválido";
    } else if (this.Peso <= 70.3) {
        this.Categoria = "Leve";
    } else if (this.Peso <= 83.9) {
        this.Categoria = "Médio";
    } else if (this.Peso <= 120.2) {
        this.Categoria = "Pesado";
    } else {
    this.Categoria = "Inválido!";
}
}
public int getVitorias() {
    return Vitorias;
}
public void setVitorias(int vitorias) {
    this.Vitorias = vitorias;
}
public int getDerrotas() {
    return Derrotas;
}
public void setDerrotas(int derrotas) {
    this.Derrotas = derrotas;
}
public int getEmpates() {
    return Empates;
}
public void setEmpates(int empates) {
    this.Empates = empates;
    }
}

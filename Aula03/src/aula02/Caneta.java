package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    int carga;
    private boolean tampada;
    protected void status() {
        System.out.print("Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.cor);
        System.out.print("Ponta: " + this.ponta);
        System.out.print("Carga: " + this.carga);
        System.out.print(" está tampada? "+ this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.print("ERRO! Não posso rabiscar!");
        } else {
            System.out.print("Estou Rabicando!");
        }
    }
    
     public void tampar() {
        this.tampada = true;
    }
    
     public void destampar() {
        this.tampada = false;
    }
}

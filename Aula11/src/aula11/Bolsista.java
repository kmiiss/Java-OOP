package aula11;
public class Bolsista extends Aluno {
    private float Bolsa;
    
    public void RenovarBolsa() {
        System.out.println("Renovando bolsa de "+ this.Nome);
    }
    
    @Override
    public void PagarMensalidade() {
        System.out.println(this.Nome + " é bolsista! Pagamento realizado com sucesso e com desconto!");
    }

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float Bolsa) {
        this.Bolsa = Bolsa;
    }
    
}

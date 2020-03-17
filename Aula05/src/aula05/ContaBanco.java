package aula05;
public final class ContaBanco {
    //Atributos
    public int NumConta;
    protected String Tipo;
    private String Dono;
    private float Saldo;
    private boolean Status;

    //Métodos Personalizados
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true); 
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fecghada porque ainda tem saldo.");
        } else if (this.getSaldo() <0) {
            System.out.println("Conta não pode ser fechada pois tem débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
       }
    public void Depositar(float v) {
        if (!this.getStatus()) {
            System.out.println("Impossível depositar em uma conta fechada.");
        } else {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }
    public void sacar(float v) {
        if (!this.getStatus()) {
            System.out.println("Impossível sacar de uma conta fechada!");
        } else {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (!this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }

//Métodos getters/setters
    public void ContaBanco(){
        
    }
    public int getNumConta() {
        return this.NumConta;
    }
    public void setNumConta(int numConta) {
        this.NumConta = numConta;
    }
    public String getTipo() {
        return this.Tipo;
    }
    public void setTipo(String tipo){
        this.Tipo = tipo; 
    }
    public String getDono(){
        return Dono;
    }
    public void setDono(String dono) {
        this.Dono = dono;
    }
    public float getSaldo() {
        return Saldo;
    }
    public void setSaldo(float saldo) {
        this.Saldo = saldo;
    }
    public boolean getStatus() {
        return Status;
    } 
    public void setStatus(boolean status) {
        this.Status = status;
    }
}
            
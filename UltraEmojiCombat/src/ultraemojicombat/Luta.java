package ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador Desafiado;
    private Lutador Desafiante;
    private int Rounds;
    private  boolean Aprovada;
    
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
        && l1 != l2){
        this.Aprovada = true;
        this.Desafiado = l1;
        this.Desafiante = l2;
    } else {
            this.Aprovada = false;
            this.Desafiado = null;
            this.Desafiante = null;
        }
    }
    public void lutar() {
        if (this.Aprovada) {
            System.out.print("---- DESAFIADO ----");
            this.Desafiado.apresentar(); 
            System.out.println("---- DESAFIANTE ----");
            this.Desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("===== RESULTADO DA LUTA ====");
            switch(vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.Desafiado.empatarLuta();
                    this.Desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.Desafiado.getNome() + "!!");
                    this.Desafiado.ganharLuta();
                    this.Desafiante.perderLuta();
                    break;
                case 3: //Desafiante vence
                    System.out.println("Vitória do " + this.Desafiante.getNome() + "!!");
                    this.Desafiante.ganharLuta();
                    this.Desafiado.perderLuta();
                    break;
            }
            System.out.println("=================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    } 
    //Métodos especial
    public Lutador getDesafiado() {
        return Desafiado;
    }
    public void setDesafiado(Lutador Desafiado) {
        this.Desafiado = Desafiado; 
    }
    public Lutador getDesafiante() {
        return Desafiante;
    }
    public void setDesafiante(Lutador Desafiante) {
        this.Desafiante = Desafiante;
    }
}

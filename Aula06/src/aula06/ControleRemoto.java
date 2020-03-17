package aula06;
public class ControleRemoto implements Controlador {
    //Atributos
    private int Volume;
    private boolean Ligado;
    private boolean Tocando;
    
    //Métodos Especiais
    public ControleRemoto() {
        this.Volume = 50;
        this.Ligado = false;
        this.Tocando = false;
    }
    //Métodos getter/setter
    private int getVolume() {
        return Volume;
    }
    private void setVolume(int Volume) {
        this.Volume = Volume;
    }
    private boolean getLigado() {
        return Ligado;
    }
    private void setLigado(boolean Ligado) {
        this.Ligado = Ligado;
    }
    private boolean getTocando() {
        return Tocando;
    }
    private void setTocando(boolean Tocando) {
        this.Tocando = Tocando;
    }

    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ MENU ------");
        System.out.println("Está ligado? " +this.getLigado());
        System.out.println("Está tocando? " +this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("[]");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(5+this.getVolume());
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(5-this.getVolume());
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
    if (this.getLigado() && this.getTocando()) {
        this.setTocando(false);
        }
    }
}

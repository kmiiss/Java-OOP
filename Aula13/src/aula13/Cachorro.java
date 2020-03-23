package aula13;
public class Cachorro extends Lobo {
        public void abanarRabo() {
            System.out.println("Abanando o rabo.");
            System.out.println("----------------------------------");

    }
    public void enterrarOsso() {
            System.out.println("Enterrando cachorro.");
    }
    
    @Override
    public void emitirSom() {
            System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String Frase) {
        if(Frase == "Olá" || Frase == "toma comida" || Frase == "Cheguei") {
            System.out.println("Abanar e Latir");
        }else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int Hora, int Min){
        if(Hora < 12) {
            System.out.println("Abanar"); 
        }else if(Hora >= 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean Dono) {
        if(Dono == true) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e Latir");
            this.emitirSom();
        }
    }
    public void reagir(int Idade, float Peso) {
        if(Idade < 5)
        if(Peso < 10) {
            System.out.println("Abanar");
        } else {
            System.out.println("Latir.");
        }
        if (Peso < 10){
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }
    
    
    @Override
    public float getPeso() {
        return Peso;
    }

    @Override
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    @Override
    public int getIdade() {
        return Idade;
    }

    @Override
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    @Override
    public int getMembros() {
        return Membros;
    }

    @Override
    public void setMembros(int Membros) {
        this.Membros = Membros;
    }
}


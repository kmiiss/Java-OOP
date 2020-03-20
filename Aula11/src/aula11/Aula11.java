package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Alan");
        a1.setMatr(1234);
        a1.setCurso("Culinária");
        a1.setIdade(27);
        a1.setSexo("Masculino");
        a1.PagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatr(1235);
        b1.setNome("Lais");
        b1.setBolsa(12.5f);
        b1.setSexo("Feminino");
        b1.PagarMensalidade();
        
    
    }    
}

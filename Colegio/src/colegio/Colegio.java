package colegio;
public class Colegio extends Pessoa{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setSexo("Mulher");
        p2.setSexo("Masculino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");
        
        p1.setIdade(25);
        p2.setIdade(24);
        p3.setIdade(23);
        p4.setIdade(22);
        
        p1.setNome("Karoline");
        p2.setNome("Claudio");
        p3.setNome("Caio");
        p4.setNome("Camila");
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}

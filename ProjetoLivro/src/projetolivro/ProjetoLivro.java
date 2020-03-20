package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
    p[0] = new Pessoa("Kauê", 22, "Homem");
    p[1] = new Pessoa("Raquel", 25, "Mulher");
    
    l[0] = new Livro("Maus - A história de um sobrevivente", "Art Spiegelman", 300, p[0]);
    l[1] = new Livro("Mundo em Descontrole - O que a globalização está fazendo de nós", "Anthony Giddens", 150, p[1]);
    l[2] = new Livro("A menina que roubava livros", "Markus Zusak", 230, p[1]);
    
    l[0].Abrir();
    l[0].Folhear(42);
    l[0].AvancarPag();
    System.out.println(l[0].detalhes());
    }
}

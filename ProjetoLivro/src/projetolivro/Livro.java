package projetolivro;
public class Livro implements Publicacao {
    private String Titulo;
    private String Autor;
    private int TotPaginas;
    private int PagAtual;
    private boolean Aberto;
    private Pessoa Leitor;

    public String detalhes() {
        return "Livro{" + "Titulo: " + Titulo + "\n Autor: " 
                + Autor + "\n TotPaginas: " + TotPaginas
                + "\n PagAtual= " + PagAtual + "\n Aberto: "
                + Aberto + "\n Leitor: " + Leitor.getNome() + "\n Idade: "+ 
                Leitor.getIdade() + "\n Sexo: " + Leitor.getSexo()+'}';
    }
   public Livro(String Titulo, String Autor, int TotPaginas, Pessoa Leitor){
       this.Titulo = Titulo;
       this.Autor = Autor;
       this.TotPaginas = TotPaginas;
       this.Aberto = false;
       this.PagAtual = 0;
       this.Leitor = Leitor;
    }
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getTotPaginas() {
        return TotPaginas;
    }

    public void setTotPaginas(int TotPaginas) {
        this.TotPaginas = TotPaginas;
    }

    public int getPagAtual() {
        return PagAtual;
    }

    public void setPagAtual(int PagAtual) {
        this.PagAtual = PagAtual;
    }

    public boolean isAberto() {
        return Aberto;
    }

    public void setAberto(boolean Aberto) {
        this.Aberto = Aberto;
    }

    public Pessoa getLeitor() {
        return Leitor;
    }

    public void setLeitor(Pessoa Leitor) {
        this.Leitor = Leitor;
    }
    
    @Override
    public void Abrir() {   
        this.Aberto = true;
    }

    @Override
    public void Fechar() {
        this.Aberto = false;
    }

    @Override
    public void Folhear(int p) {
        if (p > this.TotPaginas) {
            this.PagAtual = 0;
        } else {
        this.PagAtual = p;
    }
    }
    @Override
    public void AvancarPag() { 
          this.PagAtual++;
    }

    @Override
    public void VoltarPag() {
        this.PagAtual--;
    }
}


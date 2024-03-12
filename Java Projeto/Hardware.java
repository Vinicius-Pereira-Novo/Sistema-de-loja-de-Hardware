public class Hardware{
    String nome;
    double preco;

    public Hardware(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String toString(){
        return "Produto [nome="+ nome + ", preço="+ preco + "]";
    }
}
import java.util.Scanner;
public class Cliente{
    Scanner sc = new Scanner(System.in);
    protected String nome;
    protected String cpf;
    protected String email;
    protected String senha;

    public Cliente(String nome, String cpf, String email, String senha){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }
    public void setNome(String nome){this.nome = nome;}
    public void setCpf(String cpf){this.cpf = cpf;}
    public void setEmail(String email){this.email = email;}
    public void setSenha(String senha){this.senha = senha;}

    public void Register(){
        System.out.println("------Cadastro------");
        System.out.print("\nNome: ");
        setNome(sc.nextLine());
        System.out.print("\nCpf: ");
        setCpf(sc.nextLine());
        System.out.print("\nEmail: ");
        setEmail(sc.nextLine());
        System.out.print("\nSenha: ");
        setSenha(sc.nextLine());
        System.out.println("--------------------");
    }

    public void CompraEfetuada(){
        System.out.println("Compra Realizada!");
    }
    @Override
    public String toString(){
        return "Nome: "+nome+"\nEmail: "+email+"\nSenha: "+senha+"\nCPF: "+cpf;
    }
}
import java.util.ArrayList;
import java.util.Scanner;
public class Funcionario extends Cliente{
    Scanner sc  = new Scanner(System.in);
    private String matricula;

    public void setMatricula(String matricula){this.matricula = matricula;}

    public Funcionario(String nome, String cpf, String email, String senha, String matricula){
        super(nome,cpf,email,senha);
        this.matricula = matricula;
    }
    public void Matricula(){
        System.out.println("Digite sua matricula: ");
        setMatricula(sc.nextLine());
    }

    ArrayList<Hardware> listHardware = new ArrayList<>();
    public void RegistrarHardware(){
        int opcao;
        do{
            System.out.println("------------------------");
            System.out.println("O que senhor dejesa?");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Exibir Produtos");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1: 
                    System.out.print("\nDigite o nome do produto: ");
                    String nomeP = sc.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoP = sc.nextDouble();

                    Hardware novoHardware = new Hardware(nomeP,precoP);
                    listHardware.add(novoHardware);
                    System.out.println("Hardware adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o índice do produto a ser removido:");
                    int indiceRemover = sc.nextInt();

                    if (indiceRemover >=0&&indiceRemover<listHardware.size()){
                        listHardware.remove(indiceRemover);
                        System.out.println("Hardware removido com sucesso!");
                    }else{
                        System.out.println("Índice inválido, tente outro índice");
                    }
                    break;

                case 3:
                    System.out.println("Lista de Hardware: ");
                    for (int i = 0;i<listHardware.size();i++){
                        System.out.println(i+". "+listHardware.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
            }

        }while (opcao != 0);
    }
    public void imprimirList(){
        System.out.println("Lista de Hardware: ");
        for (int i = 0;i<listHardware.size();i++){
            System.out.println(i+". "+listHardware.get(i));
        }
    }

    public void ClienteComprar(){
        System.out.println("Selecione um produto!: ");
        int prodtCompra = sc.nextInt();
        for(int i=0;i<listHardware.size();i++){
            if(i==prodtCompra){
                System.out.println(i+". "+listHardware.get(i));
            }
        }
    }
}
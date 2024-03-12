import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente(null, null, null, null);
        Funcionario f = new Funcionario(null, null, null, null, null);
        c.Register();
        int esc;
        do{
            System.out.println("1.Cliente");
            System.out.println("2.Funcionário");
            System.out.println("0.Sair do programa");
            System.out.print("Selecione: ");
            esc = sc.nextInt();
            switch (esc){
                case 1: 
                    System.out.println("------------------------");
                    f.imprimirList();
                    f.ClienteComprar();
                    System.out.println("------------------------");
                    c.CompraEfetuada();
                    c.toString();
                    System.out.println("------------------------");
                    break;
            
                case 2:
                    System.out.println("------------------------");
                    f.Matricula();
                    f.RegistrarHardware();
                    break;

                case 0:
                    System.out.println("Saindo do programa :D");
                    break;

                default:
                    System.out.println("Opção invalida tente novamente! (T-T)");
                    break;
            }
        }while(esc != 0);
    }
}
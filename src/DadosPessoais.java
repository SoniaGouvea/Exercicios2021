import java.util.Scanner;

public class DadosPessoais {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("idade: ");
        String idade = entrada.nextLine();

        System.out.print("digite a nacionalidade: ");
        String nacionalidade = entrada.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = entrada.nextLine();

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("nacionalidade: " + nacionalidade);
        System.out.println("Cidade: " + cidade);
    }
}


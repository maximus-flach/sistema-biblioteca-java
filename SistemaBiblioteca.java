import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {

        // Responsável por ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Lista que armazenará todos os livros cadastrados
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao = 0;

        // Menu principal do sistema
        while (opcao != 3) {

            System.out.println("=== Sistema Biblioteca ===");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            // Cadastro de um novo livro
            if (opcao == 1) {

                System.out.print("Título: ");
                String titulo = scanner.nextLine();

                System.out.print("Autor: ");
                String autor = scanner.nextLine();

                System.out.print("Ano: ");
                int ano = Integer.parseInt(scanner.nextLine());

                Livro livro = new Livro(titulo, autor, ano);
                livros.add(livro);

                System.out.println("Livro cadastrado com sucesso!");

            // Listagem de todos os livros cadastrados     
            } else if (opcao == 2) {

                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    for (Livro livro : livros) {
                        livro.mostrarDados();
                    }
                }
            // Saída do sistema
            } else if (opcao == 3) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
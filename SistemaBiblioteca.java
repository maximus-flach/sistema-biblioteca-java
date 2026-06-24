import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("=== Sistema Biblioteca ===");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

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

            } else if (opcao == 2) {

                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    for (Livro livro : livros) {
                        livro.mostrarDados();
                    }
                }

            } else if (opcao == 3) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
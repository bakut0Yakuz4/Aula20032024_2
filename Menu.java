import java.util.ArrayList;
public class Menu {
    public void listar(ArrayList<Usuario> u) {
        System.out.println("\nListando usuarios...");
        for (Usuario usuario : u) {
            System.out.println("\n");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Idade: " + usuario.getIdade());
            System.out.println("RG: " + usuario.getEmail());
            System.out.println("Endereço: " + usuario.getEndereco());
            System.out.println("CPF: " + usuario.getTelefone());
        }
    }
    public void menuI() {
        System.out.println("---- Menu ----:");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Sair");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();

        Usuario u1 = new Usuario("Abner", 90, "abner@hotmail.com", "Rua das Ruas", "4192839238923");
        Usuario u2 = new Usuario("Maria", 30, "maria@yahoo.com.br", "Rua das outras Ruas", "419999999999");
        Usuario u3 = new Usuario("Pedro", 35, "pedro@proton.me", "Rua das Avenidas", "41888889999999");

        ArrayList<Usuario> u = new ArrayList<>();
        u.add(u1);
        u.add(u2);
        u.add(u3);

        menu.menuI();
        menu.listar(u);
    }
}

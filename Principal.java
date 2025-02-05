import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Usuario[] usuarios = crearUsuarios(3);
        mostrarUsuarios(usuarios);
    }

    public static Usuario[] crearUsuarios(int cantidad) {

        Scanner scanner = new Scanner(System.in);

        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();

            System.out.println("Usuario " + (i + 1) + ":");

            System.out.print("Nombre: ");
            usuarios[i].nombre = scanner.nextLine();

            System.out.print("Apellidos: ");

            usuarios[i].apellidos = scanner.nextLine();

            System.out.print("Email: ");
            usuarios[i].email = scanner.nextLine();
        }
        return usuarios;
    }

    public static void mostrarUsuarios(Usuario[] usuarios) {
        for (Usuario persona : usuarios) {
            System.out.println("Nombre: " + persona.nombre + ", Apellidos: " + persona.apellidos + ", Email: " + persona.email);
        }
    }
}

